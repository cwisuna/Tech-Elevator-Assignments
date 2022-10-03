package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {
    @Test
    public void subtotal_should_equal_sum_of_all_items() {

        // Create a shopping cart and add both taxable and non-taxable items to it.
        ShoppingCart cart = new ShoppingCart(0.10);     // 10% tax rate
        // Taxable $10 plus $1 tax
        cart.add( new Book("Dynamics of Software Development", "Jim McCarthy", 10.00));
        // Taxable $20 plus $2 tax
        cart.add( new Movie("Free Guy", "PG-13", 115, 20.00));
        // Not taxable $10
        cart.add( new Coffee("Jumbo", "Bold", new String[]{"cream"}, 10.00));

        // Act - get the subtotal
        double subtotal = cart.getSubtotalPrice();

        // Assert - Make sure value is correct
        Assert.assertEquals(40.00, subtotal, 0.00);





    }

}
