package plantitspackage;
import java.util.Scanner;
import java.util.ArrayList;
import plantitspackage.Levels.*;

public class Plantits {
    public ArrayList<Plants> plants; //store current plants and newly bought
    public ArrayList<Items> items; // store items
    private PlantManager plantManager;
    private int waterBottle;    
    private int windowCount;
    private int money;
    private Level level;
    private int grownPlantCount;

    public Plantits(PlantManager plantManager, int waterBottle, int windowCount, int money, Level level, int grownPlantCount) {
        this.plants = new ArrayList<Plants>(5);
        this.items = new ArrayList<Items>(4);
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
        Plantits plantits = new Plantits(initialLevel, 300, 10, 200, new Level1(), 0);
        plantits.runNursery();
    }

    public void runNursery() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Plantits!");

        //PRINT REPORT
        printDisplayStatus(); //location line to be adjusted 

        while (true) {
            System.out.println("======================================\n");
            System.out.println("What would you like to do?");
            System.out.println("-off");
            System.out.println("-water");
            System.out.println("-window");
            System.out.println("-shop");
            System.out.println("-inventory");
            System.out.println("-nextday\n");
            System.out.println("Enter your choice: ");
            String choice = userInput.nextLine().toLowerCase();
            System.out.println("======================================\n");
            
            switch(choice){
                case "off":
                    return;

                case "water":
                    water();
                    printDisplayStatus(); //location line to be adjusted 
                    break;

                case "window":
                    window();
                    printDisplayStatus(); //location line to be adjusted 
                    break;

                case "shop":
                    shop();
                    printDisplayStatus(); //location line to be adjusted 
                    break;

                case "inventory":
                    inventory();
                    printDisplayStatus(); //location line to be adjusted 
                    break;

                case "nextDay":
                    nextDay();
                    printDisplayStatus(); //location line to be adjusted 
                    break;
                    
                default:
                    System.out.println("Invalid input.");
                    printDisplayStatus(); //location line to be adjusted 
            }
        }
    }

    public void window() {
        plantManager.increaseSunlightLevel();
        System.out.println("\nYour plant saw light!!!");
        System.out.println("Plant had enough sun. It evacuated inside immediately.\n");
    }

    public void water(){
        if(plantManager.enoughResources(waterBottle)){
            plantManager.increaseWaterLevel();
            System.out.println("\nPlant watered.\n");
            waterBottle -= 100;
        }
    }

    public void shop() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("The available items in the shop are:");
        level.printAvailaleItems();
        System.out.println();
        System.out.println("What would you like to do?\n -buy\n -back\n");
        String choice = userInput.nextLine().toLowerCase();

        switch (choice){
            case "buy":
                System.out.println("What would you like to buy?");
                String itemChoice = userInput.nextLine().toLowerCase();
                System.out.println();

                if (level.isItemAvailable(itemChoice)) {
                    Items item = ItemFactory.createItem(itemChoice);
                    //plant classes added directly to plants arraylist not inventory
                    if (item instanceof Plants) {
                        plants.add((Plants) item);
                        // debugging
                        // for (Items i : plants){
                        //     System.out.println(i);
                        // }
                    }
                    //items added to the items arraylist in inventory
                    else{
                        items.add((Items) item); 
                        // debugging
                        // for (Items i : items){
                        //     System.out.println(i.getItemType());
                        // }
                    }
                }else{
                    System.out.println("Item not available in this Level.");
                }
                break;
            case "back":
                System.out.println("Thank you for visiting!");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }


    public void inventory() {
        if (items.size() > 0) {
            System.out.println("Here are your items:");
            for (Items i : items){
                System.out.println(i.getItemType());
            }

            System.out.println("Select item to use:");
            Scanner userInput = new Scanner(System.in);
            String itemChoice = userInput.nextLine().toLowerCase();
            System.out.println();

            Items item = ItemFactory.createItem(itemChoice);
            if (items.contains(item)){
                switch (itemChoice) {
                    case "waterbooster":
                        plantManager.waterBoosterEffect();
                        break;
                    case "sunbooster":
                        plantManager.sunBoosterEffect();
                        break;
                    case "bugrepelant":
                        // PlantManager.
                    case "antidote":
                        plantManager.antidoteEffect();
                        break;         
                    case "waterrefill":
                        waterBottle+=100;
                        break;     
                    default:
                        System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Item is not in your inventory.");
            }
        } else {
            System.out.println("You don't have any items.\n");
        }
    }

    // next day should deduct waterlevel, sunlightlevel, and planthealthlevel
    // 
    public void nextDay() {
        plantManager.deductProperties();
        //refill water in shop
        Level level = new Level();
        
        

        plantManager.bugRandomizer(0.05);

        if (plantManager.getBugs()) {
            System.out.println("Oh no! Bugs have appeared!");
            plantManager.deductPlantHealthLevel();
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
