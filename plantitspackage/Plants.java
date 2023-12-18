package plantitspackage;

public abstract class Plants {
    protected int waterReq;
    protected int sunlightReq;
    protected int buyPrice;
    protected int sellPrice;
    protected int diseaseLevel; //plant health level when disease can manifest

    public Plants(int waterReq, int sunlightReq, int buyPrice, int sellPrice, int diseaseLevel){
        this.waterReq = waterReq;
        this.sunlightReq = sunlightReq;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.diseaseLevel = diseaseLevel;
    }

    public abstract String getPlantName();
    
    //getters
    public int getWaterReq() {
        return waterReq;
    }

    public int getSunlightReq() {
        return sunlightReq;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getDiseaseLevel() {
        return diseaseLevel;
    }
}

//concrete classes
class Begonia extends Plants {
    public Begonia() {
        super(100, 100, 50, 70, 30);
    }

    @Override
    public String getPlantName() {
        return "Begonia";
    }
}

class Lavender extends Plants {
    public Lavender() {
        super(100, 100, 50,70, 30);
    }

    @Override
    public String getPlantName() {
        return "Lavender";
    }
}

class Cactus extends Plants {
    public Cactus() {
        super(100, 100, 50,70, 30);
    }

    @Override
    public String getPlantName() {
        return "Cactus";
    }
}

class Sunflower extends Plants {
    public Sunflower() {
        super(100, 100, 50,70, 30);
    }

    @Override
    public String getPlantName() {
        return "Sunflower";
    }
}



