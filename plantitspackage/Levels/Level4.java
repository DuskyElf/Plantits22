package plantitspackage.Levels;
import plantitspackage.*;

public class Level4 extends Level {
    private int WaterRefillCount = 2;

    @Override
    public void purchaseItem(Items item) {
        if (isItemAvailable(item.getItemType())){
            item.purchase(item);
            if(item.getItemType().equalsIgnoreCase("WaterRefill")){
                WaterRefillCount--;
            }
        }
        else{
            System.out.println("Sorry, this item is not available in Level 4");
        }
    }

    @Override
    public boolean isItemAvailable(String itemType) {
        if (itemType.equalsIgnoreCase("WaterRefill") && WaterRefillCount > 0){
            return true;
        } 
        else{
            return !itemType.equalsIgnoreCase("WaterRefill");
        }//all items available
    }
}

