package GB;

import javax.swing.*;

public class Conditional {

    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a >= b");
        }
        String str = a < b ? " a < b" : " a >= b";
        System.out.println(str);
        System.out.println(a < b ? "a < b" : "a >= b ");// аналог. Его называют Тернарный оператор
        int age = 22;
        if (age > 18) System.out.println("Человек является совершеннолетним");

        String in;
        in = JOptionPane.showInputDialog(null, "Введите число", JOptionPane.QUESTION_MESSAGE);
        System.out.println(in);
        if (in != null && !in.equals("")) {
            double n = Double.parseDouble(in);
            if (n > 0) System.out.println("Вы ввели положительную число!");
            else if (n == 0) System.out.println("Вы ввели нуль.");
            else System.out.println("Вы ввели отрицательное число.");



        }  System.out.println("Вы не ввели число!");
    }
}
