package GB;

import javax.swing.*;

public class CycleFor {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) System.out.print(i + "");
        }
        int summa = 0;
        int n = 10;
        for (int i = 0; i <= n; i += 2) {
            summa += i; // 2+4+6+8+10
        }
        System.out.println();
        System.out.println("Сумма четных чисел от 0 до " + n + " = " + summa);
        String in;
        in = JOptionPane.showInputDialog(null, "Введите только положительное число:", JOptionPane.QUESTION_MESSAGE);
        System.out.println(in);
        if (in != null && !in.equals("")) {
            double h = Double.parseDouble(in);
            if (h > 0) System.out.println("Вы ввели положительное число!");
            else if ( h < 0) System.out.println("Ошибка. Введите положительное число");
            else  System.out.println("Ошибочка. Требуется положительное число, никак не может быть нуль.");

            {
                int un = 0;
                for (int i = 1; i <= h; i++) {
                    un += i;
                }
                System.out.println();
                System.out.println("Сумма чисел от 1 до " + h + " = " + un);

            }
        } else
            System.out.println("Вы не ввели чиcло. Введите его повторно. Не забывайте, оно должно быть положительное.");
    }

    }

