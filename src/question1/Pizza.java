package question1;

import java.util.List;

public class Pizza {
    private String size;
    private String crustType;
    private String sauceType;
    private List<String> toppings;

    public Pizza(String size, String crustType, String sauceType, List<String> toppings) {
        this.size = size;
        this.crustType = crustType;
        this.sauceType = sauceType;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", crustType='" + crustType + '\'' +
                ", sauceType='" + sauceType + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
