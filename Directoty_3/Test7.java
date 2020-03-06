/*Написать программу, которая определяет
  какое число было введено с клавиатуры четное или нечетное.*/

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        System.out.println("Введите число");
        a = scanner.nextInt();
        b = a % 2;
        if(b ==0){
            System.out.println("Число "+ a + " ЧЕТНОЕ");
        } else if(b != 0 ) {
            System.out.println("Число "+a+" НЕЧЕТНОЕ");
        }


    }
}
