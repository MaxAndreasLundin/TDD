package max.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {
    ShoppingCart shoppingCart;

    @BeforeEach
    void setUp() {
        shoppingCart = new ShoppingCart();
    }

    @Test
    @DisplayName("Test")
    void shouldAddItem() {
        int expected = 1;
        shoppingCart.addItem("Tomato", 10);
        int actual = shoppingCart.list.size();

        Assertions.assertEquals(expected, actual);
    }
}