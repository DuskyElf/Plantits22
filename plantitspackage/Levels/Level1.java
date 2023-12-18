package plantitspackage.Levels;
import plantitspackage.*;

public class Level1 extends Level {
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
            System.out.println("Sorry, this item is not available in Level 1");
        }
    }

    @Override
    public boolean isItemAvailable(String itemType) {
        if (itemType.equalsIgnoreCase("Cactus")){
            return true;
        }
        else if (itemType.equalsIgnoreCase("WaterRefill") && WaterRefillCount > 0){
            return true;
        }
        else{
            return false;
        }
    }
}
