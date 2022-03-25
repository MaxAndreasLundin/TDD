package max.com;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class ShoppingCartTest {
    ShoppingCart shoppingCart;

    @Before
   public void setUp() {
        shoppingCart = new ShoppingCart();
        shoppingCart.addItem("Cucumber", 5);
    }

    @Test
    @DisplayName("Adding items in shopping cart")
    public void checkIfItemsAreAdded() {
        int expected = 2;
        shoppingCart.addItem("Tomato", 10);
        int actual = shoppingCart.list.size();

        Assertions.assertEquals(expected, actual);
    }
}
