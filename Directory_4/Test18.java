import java.util.Random;
import java.util.Scanner;

public class Test18 {

    public static void main(String[] args) {
        System.out.println("Guess the number: ");
        int number = new Random().nextInt(10);
        int userCase = new Scanner(System.in).nextInt();

        String result;
        if (number == userCase){
            result = "Congratulations, you guessed the number!";
        } else {
            result = "Sorry, but your number is invalid! Try again later...";
        }
        System.out.println(result);
    }
}
