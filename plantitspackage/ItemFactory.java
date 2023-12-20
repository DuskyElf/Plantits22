package plantitspackage;

public class ItemFactory {
    private static Items begonia = new Begonia();
    private static Items hydrangea = new Hydrangea();
    private static Items cactus = new Cactus();
    private static Items lavender = new Lavender();
    private static Items sunflower = new Sunflower();
    private static Items waterbooster = new WaterBooster();
    private static Items sunbooster = new SunBooster();
    private static Items bugrepelant = new BugRepelant();
    private static Items antidote = new Antidote();
    private static Items waterrefill = new WaterRefill();

    public static Items createItem(String itemType){
        switch(itemType.toLowerCase()){
            case "begonia":
                return begonia;
            case "hydrangea":
                return hydrangea;
            case "cactus":
                return cactus;
            case "lavender":
                return lavender;
            case "sunflower":
                return sunflower;
            case "waterbooster":
                return waterbooster;
            case "sun booster":
                return sunbooster;
            case "bugrepelant":
                return bugrepelant;
            case "antidote":
                return antidote;
            case "waterrefill":
                return waterrefill;
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

