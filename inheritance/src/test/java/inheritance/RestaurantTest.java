package inheritance;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;


public class RestaurantTest {

    Restaurant testRestaurant;
    @Before
    public void setUp() {
        testRestaurant = new Restaurant("Waffle House", 4, "$");
    }

    @Test
    public void testToString() {
        assertEquals("wafflehouse string should match wafflehouse",
        "Waffle House, stars 4, price $", testRestaurant.toString());
    }

    @Test
    public void testAddReview() {
        Restaurant restaurant = new Restaurant("iHop", 2, "$");
        Review review = new Review("Sojuro", "Bleh, get what you pay for", "$",);
        restaurant.addReview(review); }

}