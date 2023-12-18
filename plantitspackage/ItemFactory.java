package plantitspackage;
import java.util.Arrays;

public class ItemFactory {
    public static Items createItem(int itemType){
        switch(itemType){
            case 1:
                return new Begonia();
            case 2:
                return new Hydrangea();
            case 3:
                return new Cactus();
            case 4:
                return new Lavender();
            case 5:
                return new Sunflower();
            case 6:
                return new WaterBooster();
            case 7:
                return new SunBooster();
            case 8:
                return new BugRepelant();
            case 9:
                return new Antidote();
            case 10:
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

//ITEMS

class Begonia implements Items{
    @Override
    public void purchase(Items items) {
        System.out.println("You purchased a Begonia");
    }
    public String getItemType() {
        return "Begonia";
    }
}

class Hydrangea implements Items{
    @Override
    public void purchase(Items items) {
        System.out.println("You purchased a Hydrangea");
    }
    public String getItemType() {
        return "Hydrangea";
    }
}

class Cactus implements Items{
    @Override
    public void purchase(Items items) {
        System.out.println("You purchased a Cactus");
    }
    public String getItemType() {
        return "Cactus";
    }
}

class Lavender implements Items{
    @Override
    public void purchase(Items items) {
        System.out.println("You purchased a Lavender");
    }
    public String getItemType() {
        return "Lavender";
    }
}

class Sunflower implements Items{
    @Override
    public void purchase(Items items) {
        System.out.println("You purchased a Sunflower");
    }
    public String getItemType() {
        return "Sunflower";
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

