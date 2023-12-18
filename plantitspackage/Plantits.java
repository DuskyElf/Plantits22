package plantitspackage;
import java.util.Scanner;
import java.util.ArrayList;

public class Plantits {
    public ArrayList<Plants> plants; //store current plants and newly bought
    public ArrayList<String> items; // store items
    private PlantManager plantManager;
    private int waterBottle;    
    private int windowCount;
    private int money;
    private int level;
    private int grownPlantCount;

    public Plantits(PlantManager plantManager, int waterBottle, int windowCount, int money, int level, int grownPlantCount) {
        this.plants = new ArrayList<>(5);
        this.items = new ArrayList<>(4);
        this.plantManager = plantManager;
        this.waterBottle = waterBottle;
        this.windowCount = windowCount;
        this.money = money;
        this.level = level;
        this.grownPlantCount = grownPlantCount;
    }

    public static void main(String[] args) {
        //waterLevel, sunlightLevel, plantHealthLevel, bugs
        PlantManager initialLevel = new PlantManager(50, 50, 100, false);
        //initial levels, water bottle, window count, money, level, grown plant count
        Plantits plantits = new Plantits(initialLevel, 300, 10, 200, 1, 0);
        plantits.runNursery();
    }

    public void runNursery() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Plantits!");

        printDisplayStatus(); //location line to be adjusted 

        while (true) {
            String choice = userInput.nextLine().toLowerCase();
            
            switch(choice){
                case "off":
                    return;

                case "water":
                    water();
                    break;

                case "window":
                    plantManager.increaseSunlightLevel(plantManager.getSunlightLevel());
                    System.out.println("Your plant saw light!!!");
                    System.out.println("Plant had enough sun. It evacuated inside immediately.");
                    break;

                case "shop":
                    System.out.println("You can buy plants from the shop.");
                    //TODO: implement shop
                    break;

                case "inventory":

                case "nextDay":
                    plantManager.deductProperties(plantManager.getWaterLevel(), plantManager.getSunlightLevel(), plantManager.getPlantHealthLevel());
                    //TODO: refill water in shop 
                    
                    plantManager.bugRandomizer(0.05);

                    if (plantManager.getBugs()) {
                        System.out.println("Oh no! Bugs have appeared!");
                        plantManager.deductPlantHealthLevel(plantManager.getPlantHealthLevel());
                    }
                
                    break;
                    
                default:
                    System.out.println("Invalid input.");

            }
        }
    }

    public void water(){
        if(plantManager.enoughResources(waterBottle)){
            plantManager.increaseWaterLevel(plantManager.getWaterLevel());
            waterBottle -= 100;
        }
    }

    private void printDisplayStatus() {
        System.out.println("===============REPORT==================");
        System.out.println("Water level: " + plantManager.getWaterLevel());
        System.out.println("Sunlight level: " + plantManager.getSunlightLevel());
        System.out.println("Plant health level: " + plantManager.getPlantHealthLevel());
        System.out.println("Are there bugs?" + plantManager.getBugs()); //randomize t or f for bugs
        System.out.println("Water Bottle: " + waterBottle + "ml");
        System.out.println("Window Count: " + windowCount);
        System.out.println("Money: " + money);
        System.out.println("Level: " + level);
        System.out.println("Plants Grown: " + grownPlantCount);
        System.out.println("=======================================");
    }


}
