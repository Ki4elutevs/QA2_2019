import java.util.Random;
import java.util.Scanner;

public class Lesson1_3 {
    public static void main(String[]args) {
            Random r = new Random();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello! Let's play a game! If number is bigger, write '1', if smaller '2', if correct '0'");
            System.out.println("In what borders is your number? From 1 till ... ?");
            int maxBorder = scanner.nextInt();;
            int minBorder = 0;
            int guess = r.nextInt(maxBorder)+1;
            System.out.println("Is your number " + guess);
            int answer = scanner.nextInt();

            do {
                if (answer == 2) {
                    maxBorder = guess;
                    guess = r.nextInt(maxBorder - minBorder) + minBorder;
                    System.out.println("Is your number " + guess);
                    answer = scanner.nextInt();

                } else if (answer == 1) {
                    minBorder = guess+1;
                    guess = r.nextInt(maxBorder - minBorder) + minBorder;
                    System.out.println("Is your number " + guess);
                    answer = scanner.nextInt();
                }


            } while (answer != 0);
            System.out.println("Congratulations for me!");
        }




}
