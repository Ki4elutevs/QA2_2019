import java.util.Random;

public class Lesson1_1 {

    public static void main(String[]args) {
        Random random = new Random();

        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        int num3 = random.nextInt(100);

        int result = (num1 + num2 + num3);

        System.out.println(result);    }
    }
