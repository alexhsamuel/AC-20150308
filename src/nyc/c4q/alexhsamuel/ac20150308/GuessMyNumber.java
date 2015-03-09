package nyc.c4q.alexhsamuel.ac20150308;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = 1000;
        int number = new Random().nextInt(maxNumber) + 1;

        boolean done = false;
        while (! done) {
            System.out.print("guess? ");
            int guess = scanner.nextInt();

            if (guess < 1 || guess > maxNumber)
                System.out.println("please guess between 1 and " + maxNumber);
            else if (guess > number)
                System.out.println("too high!");
            else if (guess < number)
                System.out.println("too low!");
            else {
                System.out.print("that's right!");
                done = true;
            }
        }
    }
}
