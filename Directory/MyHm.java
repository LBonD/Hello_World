import javax.swing.*;

public class MyHm {
    public static void main(String [] args ){
        String in;
        in = JOptionPane.showInputDialog(null, "Введите число", JOptionPane.QUESTION_MESSAGE);
        System.out.println(in);
        if (in != null && !in.equals("")) {
        double n = Double.parseDouble(in);
        if (n > 0) System.out.println("Вы ввели положительную число!");
            else if (n == 0) System.out.println("Вы ввели нуль.");
            else System.out.println("Вы ввели отрицательное число.");
//            System.out.println();
//


        }  System.out.println("Вы не ввели число!");
    }
    }

