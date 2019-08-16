import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    int dogCount = 1;
System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

int catCount = 2;
System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

int turtleCount = 0;
System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

System.out.println(flipNHeads(2));

  }

  public static String pluralize(String pet, int count) {
    if (count == 0 || count > 1) {
      return pet + "s";
    } else {
      return pet;
    }
  }

  public static String flipNHeads(int n) {
    int timesFlipped = 0;
    int headsCounter = 0;

    while (headsCounter < n) {
      double rand = Math.random();
      timesFlipped++;

      if (rand >= 0.5) {
        headsCounter++;
        System.out.println("heads!");
      } else {
        System.out.println("tails!");
        headsCounter = 0;
      }
    }

    return "It took " + timesFlipped + " flips to flip " + headsCounter + " heads in a row.";
  }
}