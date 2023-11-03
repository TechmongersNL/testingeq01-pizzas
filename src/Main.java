// Main.java
public class Main {
    public static void main(String[] args) {
        // Same Customer for all
        Customer john = new Customer();
        // ^      ^           ^
        // type
        //      variable
        //                  constructor
        john.name = "John Doe";
        john.phoneNumber = "+31612345678";

        Pizza smallPizza = new SmallPizza();

        Pizza mediumPizza = new Pizza();
        mediumPizza.size = 1;
        mediumPizza.slices = 8;
        mediumPizza.price = 10.99F;
        mediumPizza.vegetarian = true;

        Pizza largePizza = new Pizza();
        largePizza.size = 2;
        largePizza.slices = 10;
        largePizza.price = 13.99F;

        Order smallOrder = new Order();
        smallOrder.customer = john;
        smallOrder.pizzas = new Pizza[]{smallPizza};
        smallOrder.print();

        Order mediumOrder = new Order();
        mediumOrder.customer = john;
        mediumOrder.pizzas = new Pizza[]{mediumPizza};
        mediumOrder.print();

        Order largeOrder = new Order();
        largeOrder.customer = john;
        largeOrder.pizzas = new Pizza[]{largePizza, smallPizza};
        largeOrder.print();
    }
}