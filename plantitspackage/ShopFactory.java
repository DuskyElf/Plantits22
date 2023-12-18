package plantitspackage;

public class ShopFactory {
    public static Shop createShop(int levelNum){
        switch(levelNum){
            case 1:
                return new Shop1();
            case 2:
                return new Shop2();
            case 3:
                return new Shop3();
            case 4:
                return new Shop4();
            default:
                throw new IllegalArgumentException("Invalid level number");
        }
    }
}

class Shop1 implements Shop{
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

class Shop2 implements Shop{
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
            System.out.println("Sorry, this item is not available in Level 2");
        }
    }
    @Override
    public boolean isItemAvailable(String itemType) {
        if (itemType.equalsIgnoreCase("Cactus") ||
        itemType.equalsIgnoreCase("Begonia") ||
        itemType.equalsIgnoreCase("Hydrangea")){
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

class Shop3 implements Shop{
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
            System.out.println("Sorry, this item is not available in Level 3");
        }
    }
    @Override
    public boolean isItemAvailable(String itemType) {
        if (itemType.equalsIgnoreCase("Cactus") ||
        itemType.equalsIgnoreCase("Begonia") ||
        itemType.equalsIgnoreCase("Hydrangea") ||
        itemType.equalsIgnoreCase("SunBooster") ||
        itemType.equalsIgnoreCase("BugRepelant") ||
        itemType.equalsIgnoreCase("Antidote")){
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

class Shop4 implements Shop{
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