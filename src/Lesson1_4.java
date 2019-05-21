import java.util.Random;
import java.util.Scanner;

public class Lesson1_4 {
    public static void main(String[]args){
        Random random = new Random();
        int guess = random.nextInt(100)+1;
        int enter;
        Scanner scanner = new Scanner(System.in);
        System.out.println(guess);
        System.out.print("Please enter numberkk: ");
        enter = scanner.nextInt();

        do {
            if (enter>guess){
                System.out.print("Smaller. Please enter number: ");
                enter = scanner.nextInt();
            } else if (enter<guess){
                System.out.print("Bigger. Please enter number: ");
                enter = scanner.nextInt();
            }

        } while (enter!=guess);
        System.out.println("Congratulations!");


    }

}
