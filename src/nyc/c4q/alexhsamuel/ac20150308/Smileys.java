package nyc.c4q.alexhsamuel.ac20150308;

import java.util.Scanner;

/**
 * Created by samuel on 2015-03-08.
 */
public class Smileys {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How do you feel? ");
        String emoticon = scanner.next();

        String emotion;
        if (emoticon.equals(":)"))
            emotion = "happy";
        else if (emoticon.equals(":("))
            emotion = "sad";
        else if (emoticon.equals(":|"))
            emotion = "plain";
        else {
            System.out.println("I don't know that one.");
            return;
        }

        System.out.println("You're " + emotion + ".");
    }
}
