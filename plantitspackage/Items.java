package plantitspackage;

public interface Items {
    void purchase(Items item);
    boolean isPlant(String itemType);
    String getItemType();
}