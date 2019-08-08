package basiclibrary;

public class RollingDice {

//accepts an integer n and rolls a six-sided dice n times
    public static int[] roll(int n) {
        int[] rolls = new int[n];

        for (int i = 0; i < n; i++) {
            int rand = (int)(Math.random() * 6 + 1);
            rolls[i] = rand;
        }

        return rolls;
    }
}