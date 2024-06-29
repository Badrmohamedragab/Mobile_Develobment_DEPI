public class OrderDisplay {
    public void displayOrder(Order order) {
        System.out.println("Your order is:");
        System.out.println(order.getSandwich());
        for(int i = 0 ; i < order.getAdditions().size(); i++){
            System.out.print(order.getAdditions().get(i).getName());
            if(i != order.getAdditions().size() - 1)
            {
                System.out.print(" + ");
            }
        }
    }

    public void displayReceipt(Order order, double total) {
        System.out.println("Receipt:");

        System.out.println(order.getSandwich().getName() + " " + order.getSandwich().getPrice());

        for (Addition addition : order.getAdditions()) {
            System.out.println("Extra " + addition.getName() + " " + addition.getPrice());
        }
        System.out.println("Total: " + total);
    }
}
