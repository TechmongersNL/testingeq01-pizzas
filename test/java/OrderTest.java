import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class OrderTest {
    @Test
    void humanReadableBooleanTest() {
        assertEquals("Yes", Order.humanReadableBoolean(true));
        assertEquals("No", Order.humanReadableBoolean(false));
    }
}
