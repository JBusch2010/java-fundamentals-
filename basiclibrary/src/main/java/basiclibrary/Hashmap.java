package basiclibrary;

import java.util.*;

public class Hashmap {
    public static String seattleWeatherData(int[][] weeklyMonthlyTemperatures) {
        //https://www.geeksforgeeks.org/hashset-in-java/
        //used to keep track of temps
        HashSet<Integer> h = new HashSet<>();

        //Iterate through all of the data to find the min and max values and adding to the HashSet
        for (int i = 0; i < weeklyMonthlyTemperatures.length; i++) {
            for (int j = 0; j < weeklyMonthlyTemperatures[i].length; j++) {
                h.add(weeklyMonthlyTemperatures[i][j]);
            }
        }

        // http://www.java2s.com/Tutorial/Java/0140__Collections/FindmaximumelementofHashSet.htm
        int maxTemps = Collections.max(h);
        int minTemps = Collections.min(h);

        // https://www.javatpoint.com/StringBuilder-class
        StringBuilder uniqueTemps = new StringBuilder();

        uniqueTemps.append("High: ").append(maxTemps).append(System.getProperty("line.separator"));
        uniqueTemps.append("Low: ").append(minTemps).append(System.getProperty("line.separator"));

        for (int i = minTemps; i <= maxTemps; i++) {
            if (!h.contains(i)) {
                uniqueTemps.append("Never saw temperature: ").append(i).append(System.getProperty("line.separator"));
            }
        }

        return uniqueTemps.toString();
    }

}
