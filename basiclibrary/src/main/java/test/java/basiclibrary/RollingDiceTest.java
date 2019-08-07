package test.java.basiclibrary;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import basiclibrary.RollingDice;

public class RollingDiceTest {

  @Test
  public void rollingDiceTest_roll1Time() {
      int expectedArrayLength = 1;
      assertEquals(expectedArrayLength, RollingDice.roll(1).length);
  }

}