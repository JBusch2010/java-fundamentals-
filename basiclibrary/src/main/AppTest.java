package demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        assertNotNull("app should have a greeting", App.getGreeting());
    }
}