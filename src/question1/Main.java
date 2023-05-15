package question1;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new PizzaBuilder()
                .setSize("Large")
                .setCrustType("Thin")
                .setSauceType("Tomato")
                .addTopping("Mushrooms")
                .addTopping("Pepperoni")
                .build();

        System.out.println("Your have ordered pizza :"+pizza+ " \nEnjoy your pizza party! Have Fun!!");
    }
}
