public class Pizza {
    byte size;
    float price;
    byte slices;
    boolean vegetarian = false;

    Topping[] toppings;

    static final String[] sizes = {"Small", "Medium", "Large"};

    public String humanReadableSize() {
        byte safeSize = (byte) Math.max(size, 0);
        if (size > sizes.length - 1) {
            safeSize = (byte) (sizes.length - 1);
        }
        return sizes[safeSize];
    }
}
