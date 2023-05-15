package question1;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private String size;
    private String crustType;
    private String sauceType;
    private List<String> toppings = new ArrayList<>();

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setCrustType(String crustType) {
        this.crustType = crustType;
        return this;
    }

    public PizzaBuilder setSauceType(String sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }
    public Pizza build() {
        return new Pizza(size, crustType, sauceType, toppings);
    }

    @Override
    public String toString() {
        return "PizzaBuilder{" +
                "size='" + size + '\'' +
                ", crustType='" + crustType + '\'' +
                ", sauceType='" + sauceType + '\'' +
                ", toppings=" + toppings +
                '}';
    }

}
