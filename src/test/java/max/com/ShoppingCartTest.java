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
    @DisplayName("Add one item to the cart")
    void shouldAddOneItem() {
        int expected = shoppingCart.list.size() + 1;
        shoppingCart.addItem("Tomato", 10);
        int actual = shoppingCart.list.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Size of list should not be the same after adding item")
    void sizeOfListShouldNotBeSameAfterAddingItem() {
        int expected = shoppingCart.list.size();
        shoppingCart.addItem("Tomato", 10);
        int actual = shoppingCart.list.size();
        Assertions.assertNotEquals(expected, actual);
    }

    @Test
    @DisplayName("Remove lemon from the cart")
    void shouldRemoveLemon() {
        shoppingCart.list.remove("Lemon");
        Assertions.assertFalse(shoppingCart.list.containsKey("Lemon"));
    }

    @Test
    @DisplayName("Check if cart contains Apple")
    void shouldContainApple() {
        Assertions.assertTrue(shoppingCart.list.containsKey("Apple"));
    }

    @Test
    @DisplayName("Total value of cart")
    void shouldReturnTotalValueOfCart() {
        int expected = 38;
        int actual = shoppingCart.totalValueOfCart();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Checking for exceptions")
    void noExceptionShouldBeThrownWhenAddingProduct() {
        shoppingCart.addItem("Banana", 3);
        Assertions.assertTrue(true);
    }
}