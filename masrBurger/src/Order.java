import java.util.ArrayList;
import java.util.List;

public class Order {
    private Sandwich sandwich;
    private final List<Addition>additions = new ArrayList<>();

    public void setSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public void addAdditions(Addition addition) {
        additions.add(addition);
    }
    public Sandwich getSandwich() {
        return sandwich;
    }

    public List<Addition> getAdditions() {
        return additions;
    }

}
