import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        System.out.println("Введите два числа:");
        System.out.println("a =  ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("b =  ");
        int b = new Scanner(System.in).nextInt();

        int result = a > b ? a : b ;

        System.out.println("Max: "+result);
    }
}
