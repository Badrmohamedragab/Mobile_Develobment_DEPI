public class OrderCalculate {
    public double calculateTotal(Order order) {
        double total = order.getSandwich().getPrice();
        for (Addition addition : order.getAdditions()) {
            total += addition.getPrice();
        }
        return total;
    }
}
