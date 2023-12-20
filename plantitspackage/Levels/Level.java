package plantitspackage.Levels;
import plantitspackage.*;

public abstract class Level {
    //ADDED THIS FOR WATER REFILL
    private int WaterRefillCount = 2;
    
    void purchaseItem(Items item) {

    }

    public boolean isItemAvailable(String itemType) {
        return false;
    }

    //ANDY ADDED THIS FOR WATER REFILL
    public void refillWater(){
        WaterRefillCount = 2;
    }

    public void printAvailaleItems() {
        for (String item : ItemFactory.getItems()) {
            if (this.isItemAvailable(item)) {
                System.out.println(item);
            }
        }
    }
}
