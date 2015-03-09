package nyc.c4q.alexhsamuel.ac20150308;

import java.util.Scanner;

/**
 * Created by samuel on 2015-03-08.
 */
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What day is it today? ");
        String day = scanner.next();

        if (day.equalsIgnoreCase("monday")
                || day.equalsIgnoreCase("tuesday")
                || day.equalsIgnoreCase("wednesday")
                || day.equalsIgnoreCase("thursday")
                || day.equalsIgnoreCase("friday"))
            System.out.println("weekday");
        else if (day.equalsIgnoreCase("saturday")
                || day.equalsIgnoreCase("sunday"))
            System.out.println("weekend");
        else
            System.err.println("not a day of the week");
    }
}
