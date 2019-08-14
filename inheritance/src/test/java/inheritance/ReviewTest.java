package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    Review testReview;
    @Before
    public void setUp() {
        testReview = new Review("Smitty Werbenjagermanjensen",
                " All star > anything else", 4);
    }

    @Test
    public void testToString() {
        assertEquals("review string should match review",
                "Smitty Werbenjagermanjensen, All star > anything else," +
                        " stars 4", testReview.toString());
    }

}