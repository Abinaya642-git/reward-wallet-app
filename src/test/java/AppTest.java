import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testHighTransaction() {
        assertEquals(20, App.calculateReward(200));
    }

    @Test
    void testLowTransaction() {
        assertEquals(10, App.calculateReward(100));
    }

    @Test
    void testInvalidTransaction() {
        assertThrows(IllegalArgumentException.class, () -> {
            App.calculateReward(-50);
        });
    }
}