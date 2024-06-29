import java.util.Objects;
import java.util.Scanner;

public class AdminManager extends Manager{

    public AdminManager(SandwichMenu sandwichMenu, AdditionsMenu additionsMenu) {
        super(sandwichMenu, additionsMenu);
    }

    @Override
    public void start() {
        while(true) {
            System.out.println();

            System.out.print("1-View Menu\n" +
                    "2-View Additions\n" +
                    "3-Add New Item To Menu\n" +
                    "4-Add New Addition\n" +
                    "5-Exit\n" +
                    "Choose an option:");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if(choice == 1)
                this.sandwichMenu.displayMenu();

            else if(choice == 2)
                this.additionsMenu.displayMenu();

            else if(choice == 3)
            {
                System.out.println();
                System.out.println("New Sandwich:");
                System.out.print("Enter Name: ");
                String sandwichName = scanner.next();
                System.out.print("Enter Price: ");
                int sandwichPrice = scanner.nextInt();
                System.out.print("Confirm:(Y/N)->");
                String confirm = scanner.next();
                if(confirm.equals("Y"))
                {
                    sandwichMenu.addItem(new Sandwich(sandwichName, sandwichPrice));
                }
            }
            else if(choice == 4)
            {
                System.out.println();
                System.out.println("New Addition:");
                System.out.print("Enter Name: ");
                String AdditionName = scanner.next();
                System.out.print("Enter Price: ");
                int AdditionPrice = scanner.nextInt();
                System.out.print("Confirm:(Y/N)->");
                String confirm = scanner.next();
                if(confirm.equals("Y"))
                {
                    additionsMenu.addItem(new Addition(AdditionName, AdditionPrice));
                }
            }
            else if(choice == 5)
            {
                System.exit(0);
            }
            else {
                System.out.println();
                System.out.println("Input Error");
            }
        }
    }
}
