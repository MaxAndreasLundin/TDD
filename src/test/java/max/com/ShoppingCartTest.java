package max.com;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class ShoppingCartTest {
    ShoppingCart shoppingCart;

    @BeforeEach
    void setUp() {
        shoppingCart = new ShoppingCart();
    }

    @Test
    @DisplayName("Bajs")
    public void checkIfItemsAreAdded() {
        int expected = 1;
        shoppingCart.addItem("Tomat", 10);
        int actual = shoppingCart.list.size();

        Assertions.assertEquals(expected, actual);
    }
}
