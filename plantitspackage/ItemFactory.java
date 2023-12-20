package plantitspackage;

public class ItemFactory {
    public static Items createItem(String itemType){
        switch(itemType.toLowerCase()){
            case "begonia":
                return new Begonia();
            case "hydrangea":
                return new Hydrangea();
            case "cactus":
                return new Cactus();
            case "lavender":
                return new Lavender();
            case "sunflower":
                return new Sunflower();
            case "waterbooster":
                return new WaterBooster();
            case "sun booster":
                return new SunBooster();
            case "bugrepelant":
                return new BugRepelant();
            case "antidote":
                return new Antidote();
            case "waterrefill":
                return new WaterRefill();
            default:
                throw new IllegalArgumentException("Invalid item type");
        }
    }

    public static String[] getItems() {
        String[] items = {
                "Begonia",
                "Hydrangea",
                "Cactus",
                "Lavender",
                "Sunflower",
                "WaterBooster",
                "SunBooster",
                "BugRepelant",
                "Antidote",
                "WaterRefill"
        };
        return items;
    }
}

class WaterBooster implements Items{
    @Override
    public void purchase(Items items) {
        System.out.println("You purchased a WaterBooster");
    }
    public String getItemType() {
        return "WaterBooster";
    }
}

class SunBooster implements Items{
    @Override
    public void purchase(Items items) {
        System.out.println("You purchased a SunBooster");
    }
    public String getItemType() {
        return "SunBooster";
    }
}

class BugRepelant implements Items{
    @Override
    public void purchase(Items items) {
        System.out.println("You purchased a BugRepelant");
    }
    public String getItemType() {
        return "BugRepelant";
    }
}

class Antidote implements Items{
    @Override
    public void purchase(Items items) {
        System.out.println("You purchased a Antidote");
    }
    public String getItemType() {
        return "Antidote";
    }
}

class WaterRefill implements Items{
    @Override
    public void purchase(Items items) {
        System.out.println("You purchased a WaterRefill");
    }
    public String getItemType() {
        return "WaterRefill";
    }
}

