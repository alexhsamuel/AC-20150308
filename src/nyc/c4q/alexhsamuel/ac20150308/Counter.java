package nyc.c4q.alexhsamuel.ac20150308;

/**
 * Created by samuel on 2015-03-08.
 */
public class Counter {
    public static void main(String[] args) {
        int counter = 100;
        while (counter >= 1) {
            System.out.println(counter);
            if (counter > 10) {
                counter -= 5;
            }
            else {
                counter -= 1;
            }
        }
        System.out.println("blastoff!");
    }
}
