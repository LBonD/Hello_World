/*Написать метод на Java,
  который выводит результат суммы
  2-х чисел введенных с клавиатуры.*/

import java.util.Scanner;

public class Test2 {
    void sm(int a, int b) {
        int sum = a + b;
        System.out.println("Сумма " + a + "+" + b + "= " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Введите первое число ");
        a = scanner.nextInt();
        System.out.println("Введите второе число ");
        b = scanner.nextInt();
        test2 summa = new test2();
        summa.sm(a, b);


    }
}
