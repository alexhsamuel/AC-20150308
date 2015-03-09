package nyc.c4q.alexhsamuel.ac20150308;

import java.util.Scanner;

public class MandM {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);

        int count = 100;  // Running total of number of M&Ms.
        while (count > 0) {
            System.out.println("you have " + count + " M&Ms left");

            System.out.print("eat how many? ");
            int eat = scanner.nextInt();
            if (eat < 0) {
                System.out.println("you can't eat a negative M&M");
            }
            else if (eat <= count) {
                count -= eat;   // same as count = count - eat
            }
            else {
                System.out.print("you don't have that many!");
            }
        }

        System.out.println("all the M&Ms are gone");
    }
}
