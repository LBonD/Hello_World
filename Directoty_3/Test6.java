/*Написать метод вычисляющий среднее арифметическое
  трех чисел введенных с клавиатуры.*/

import java.util.Scanner;

public class Test6 {
    void average (double a, double b, double c ){
        System.out.println("Cреднее арифметическое " + (a+b+c)/3);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        test6 average = new test6();
        double a, b, c;
        System.out.println("Введите первое число ");
        a = scanner.nextInt();
        System.out.println("Введите второе число ");
        b = scanner.nextInt();
        System.out.println("Введите третье число ");
        c = scanner.nextInt();
        average.average(a,b,c);

    }
}
