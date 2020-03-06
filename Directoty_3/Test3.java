/*Написать метод, который выводит результат от
  деления введенных чисел и исключает деление на ноль.*/

import java.util.Scanner;

public class Test3 {
    void division (int a, int b){
        double div;
        if(b != 0){
            System.out.println(a + " : " + b + " = "+ a/b);
            } else System.out.println("Делить на нуль нельзя =)");
            }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        test3 divis = new test3();
        int a, b;
        System.out.println("Введите первое число ");
        a = scanner.nextInt();
        System.out.println("Введите второе число ");
        b = scanner.nextInt();
        divis.division(a, b);

    }
}
