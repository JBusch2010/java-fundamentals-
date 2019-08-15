package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void testToString() {
        Theater theater = new Theater("Riverwatch");
        assertEquals("Welcome to Riverwatch theater!", theater.toString());
    }

    @Test
    public void testAddMovie() {
        Theater theater = new Theater("Regal");
        theater.addMovie("Naruto: The Last");
        assertEquals("Naruto: The Last", theater.movies.get(0));
    }

    @Test
    public void testAddReview() {
        Theater theater = new Theater("Regal");
        Review review = new Review(" Awesome seats! Awesome sound quality!", "Sojuro",
                5, theater);
        theater.addReview(review);
        assertEquals("Sojuro, Awesome seats! Awesome sound quality!," +
                " stars 5", theater.reviews.get(0).toString());
    }
}