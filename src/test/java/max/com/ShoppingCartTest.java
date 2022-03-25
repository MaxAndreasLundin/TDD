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
        shoppingCart.addItem("Lemon", 25);
        shoppingCart.addItem("Apple", 13);
    }

    @Test
    @DisplayName("Add one item to cart")
    void shouldAddOneItem() {
        int expected = 3;
        shoppingCart.addItem("Tomato", 10);
        int actual = shoppingCart.list.size();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkTotalValueOfCart() {
        int expected = 38;
        int actual = shoppingCart.totalValueOfCart();

        Assertions.assertEquals(expected, actual);
    }
}