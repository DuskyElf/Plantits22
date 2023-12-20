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

    public void bugRandomizer(double value) {
        bugs = (Math.random() < value);
    }

    public boolean requiredReached(){
        return (waterLevel >= 100 && sunlightLevel >= 100);
    }

    public void increaseWaterLevel(){
        waterLevel += 10;
    }

    public void waterBoosterEffect(){
        waterLevel += 20;
    }

    public void increaseSunlightLevel(){
        sunlightLevel += 10;
    }

    public void sunBoosterEffect(){
        waterLevel += 20;
    }
    //bugs
    public void deductPlantHealthLevel(){
        plantHealthLevel -= 10;
    }

    public boolean plantSick(int diseaseLevel){
        return (plantHealthLevel <= diseaseLevel);
    }
    
    public void antidoteEffect(){
        plantHealthLevel += 50;
    }

    public void deductProperties (){
        waterLevel -= 10;
        sunlightLevel -= 10;
        plantHealthLevel -= 10;
    }
    
    //watercost = 100ml 
    public boolean enoughResources(int waterCost){
        return(waterCost >= 100);
    }
}


