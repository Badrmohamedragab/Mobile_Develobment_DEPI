import java.util.Scanner;

public class UserManager extends Manager{

    public UserManager(SandwichMenu sandwichMenu, AdditionsMenu additionsMenu) {
        super(sandwichMenu, additionsMenu);
    }

    @Override
    public void start() {
        while(true)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println();

            System.out.println("Welcome to our restaurant");
            sandwichMenu.displayMenu();

            System.out.print("Please select option: ");
            int choiceBurger = scanner.nextInt();

            System.out.println();

            System.out.println("Do you like to add any additions?\n1-Yes\n2-No");
            int checkAddition = scanner.nextInt();

            Order order = new Order();
            order.setSandwich((Sandwich) sandwichMenu.getItems().get(choiceBurger - 1));

            if (checkAddition == 1)
            {
                System.out.println();
                additionsMenu.displayMenu();
                System.out.print("Please select options (like this 1,2): ");
                scanner.nextLine();
                String[] choiceAddition = scanner.nextLine().split(",");
                for(String choice : choiceAddition)
                {
                    order.addAdditions((Addition) this.additionsMenu.getItems().get(Integer.parseInt(choice) - 1));
                }
            }

            System.out.println();
            OrderDisplay orderDisplay = new OrderDisplay();
            orderDisplay.displayOrder(order);

            System.out.println();
            System.out.print("1- Confirm\n2- Back to Menu\nPlease select option: ");
            int choiceConfirmation = scanner.nextInt();
            if(choiceConfirmation == 1)
            {
                OrderCalculate orderCalculate = new OrderCalculate();
                double totalCost = orderCalculate.calculateTotal(order);
                orderDisplay.displayReceipt(order, totalCost);
            }
            else {
                continue;
            }
            System.out.print("1- Back to Menu\n2- Exit\nPlease select option: ");
            int checkExit = scanner.nextInt();
            if(checkExit != 1)
                System.exit(0);
        }
    }
}
