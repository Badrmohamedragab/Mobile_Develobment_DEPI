import java.util.ArrayList;
import java.util.List;

public class AdditionsMenu extends Menu {
    @Override
    public void displayMenu() {
        System.out.println("Additions:");
        for (int i = 0; i < getItems().size(); i++) {

            System.out.println((i + 1) + ". " + getItems().get(i).getName() + " - " + getItems().get(i).getPrice() + "$");
        }

    }
}
