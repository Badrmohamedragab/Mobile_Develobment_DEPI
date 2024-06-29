public class SandwichMenu extends Menu{
    @Override
    public void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < getItems().size(); i++) {

            System.out.println((i + 1) + ". " + getItems().get(i).getName() + " - " + getItems().get(i).getPrice() + "$");
        }

    }
}
