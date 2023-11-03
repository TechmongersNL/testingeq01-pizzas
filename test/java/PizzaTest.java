// PizzaTest.java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTest {
    @Test
    void humanReadableSizeTest() {
        Pizza pizza = new Pizza();

        pizza.size = 0;
        assertEquals("Small", pizza.humanReadableSize());

        pizza.size = 1;
        assertEquals("Medium", pizza.humanReadableSize());

        pizza.size = 2;
        assertEquals("Large", pizza.humanReadableSize());
    }
}