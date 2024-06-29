import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SandwichMenu sandwichMenu = new SandwichMenu();
        AdditionsMenu additionMenu = new AdditionsMenu();
        sandwichMenu.addItem(new Sandwich("Beef Burger", 80));
        sandwichMenu.addItem(new Sandwich("Chicken Burger", 90));
        sandwichMenu.addItem(new Sandwich("Cheese Burger", 70));

        additionMenu.addItem(new Addition("Catchup", 10));
        additionMenu.addItem(new Addition("Mayonnaise", 10));
        additionMenu.addItem(new Addition("Tomatoes", 5));
        additionMenu.addItem(new Addition("Cheese", 15));

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("1-User\n2-Admin\nChoose an option:");
            int chooseManager = scanner.nextInt();
            Manager manager;
            if(chooseManager == 1)
            {
                manager = new UserManager(sandwichMenu, additionMenu);
            } else if (chooseManager == 2) {
                manager = new AdminManager(sandwichMenu, additionMenu);
            }
            else {
                continue;
            }
            manager.start();
        }

    }
}
