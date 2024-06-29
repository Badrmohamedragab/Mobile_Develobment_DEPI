import java.util.ArrayList;
import java.util.List;
public abstract class Menu {
    private List<Item> items = new ArrayList<>();
    public void addItem(Item item) {
        items.add(item);
    }
    public List<Item> getItems() {
        return items;
    }
    public abstract void displayMenu();

}
