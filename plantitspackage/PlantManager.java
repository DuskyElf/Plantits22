package plantitspackage;

public class PlantManager {

    int waterLevel;
    int sunlightLevel;
    int plantHealthLevel;
    boolean bugs;

    public PlantManager(int waterLevel, int sunlightLevel, int plantHealthLevel, boolean bugs) {
        this.waterLevel = waterLevel;
        this.sunlightLevel = sunlightLevel;
        this.plantHealthLevel = plantHealthLevel;
        this.bugs = bugs;
    }   

    //getters
    public int getWaterLevel() {
        return waterLevel;
    }
    
    public int getSunlightLevel() {
        return sunlightLevel;
    } 
    
    public int getPlantHealthLevel() {
        return plantHealthLevel;
    }

    public boolean getBugs() {
        return bugs;
    }

    public boolean bugRandomizer(double value) {
        bugs = (Math.random() < value);
    }

    public boolean requiredReached(){
        return (waterLevel >= 100 && sunlightLevel >= 100);
    }

    public void increaseWaterLevel(int waterLevel){
        waterLevel += 10;
    }

    public void waterBoosterEffect(int waterLevel){
        waterLevel += 20;
    }
    public void increaseSunlightLevel(int sunlightLevel){
        sunlightLevel += 10;
    }

    public void sunBoosterEffect(int waterLevel){
        waterLevel += 20;
    }
    //bugs
    public void deductPlantHealthLevel(int plantHealthLevel){
        plantHealthLevel -= 10;
    }

    public boolean plantSick(int plantHealthLevel, int diseaseLevel){
        return (plantHealthLevel <= diseaseLevel);
    }
    
    public void antidoteEffect(int plantHealthLevel){
        plantHealthLevel += 50;
    }

    public void deductProperties (int waterLevel, int sunlightLevel, int plantHealthLevel){
        waterLevel -= 10;
        sunlightLevel -= 10;
        plantHealthLevel -= 10;
    }
    
    //watercost = 100ml 
    public boolean enoughResources(int waterCost){
        return(waterCost >= 100);
    }
}


