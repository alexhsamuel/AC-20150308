package nyc.c4q.alexhsamuel.ac20150308;

import java.util.Scanner;

/**
 * Created by samuel on 2015-03-08.
 */
public class IfElse {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your score? ");
        int score = scanner.nextInt();

        if (score == 100) {
            System.out.println("Perfect score!");
        }
        else if (score >= 90) {
            System.out.println("Great!");
        }
        else if (score >= 75) {
            System.out.println("Not bad!");
        }
        else if (score >= 60)
            System.out.println("You passed.");
        else {
            System.out.println("you failed");
            System.out.println("next time study harder");
        }

        System.out.println("We're done!");

    }
}
