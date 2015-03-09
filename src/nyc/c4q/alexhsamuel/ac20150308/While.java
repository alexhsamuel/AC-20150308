package nyc.c4q.alexhsamuel.ac20150308;

import java.util.Scanner;

/**
 * Created by samuel on 2015-03-08.
 */
public class While {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);

        int x = 10;
        while (x <= 100) {
            System.out.println("the number is " + x);
            System.out.println("what's another number? ");
            x = scanner.nextInt();
        }
    }
}
