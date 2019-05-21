import java.util.Random;

public class Lesson1_2 {

    public static void main(String[]args) {
        Random r = new Random();
        int die1, die2, die3;
        int count =0;

        do {


            die1 = r.nextInt(6) + 1;
            die2 = r.nextInt(6) + 1;
            die3 = r.nextInt(6) + 1;

            count++;
            System.out.println(count);
            System.out.println("Dice: " + die1);
            System.out.println("Dice: " + die2);
            System.out.println("Dice: " + die3);
        }
        while((die1 != die2) ||  (die2 != die3));



    }
}
