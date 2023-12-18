package plantitspackage.Levels;
import plantitspackage.*;

public abstract class Level {
    void purchaseItem(Items item) {

    }

    public boolean isItemAvailable(String itemType) {
        return false;
    }

    public void printAvailaleItems() {
        for (String item : ItemFactory.getItems()) {
            if (this.isItemAvailable(item)) {
                System.out.println(item);
            }
        }
    }
}
