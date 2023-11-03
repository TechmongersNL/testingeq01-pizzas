public class Order {
    Customer customer;
    Pizza[] pizzas;

    public void print() {
        System.out.println("Pizza Order Details:");

        for (int i = 0; i < pizzas.length; i++) {
            System.out.printf(
                    """
                    Pizza Number: %d
                    Size: %s
                    Price: $%.2f
                    Slices: %d
                    Vegetarian: %s
                    Customer Name: %s
                    Phone Number: %s
                                            
                    """,
                    i + 1,
                    pizzas[i].humanReadableSize(),
                    pizzas[i].price,
                    pizzas[i].slices,
                    humanReadableBoolean(pizzas[i].vegetarian),
                    customer.name,
                    customer.phoneNumber
            );
        }

    }

    public static String humanReadableBoolean(boolean bool) {
        return bool ? "Yes" : "No";
    }
}
