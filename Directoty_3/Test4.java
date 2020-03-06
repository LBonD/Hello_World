/*Найти скорость автомобиля, зная расстояние и время.*/

import java.util.Scanner;

public class Test4 {
    void speed (double s, double t ){
        if (t != 0) {
            System.out.println("Скорость автомобиля " + s / t);
        } else System.out.println("Время не может быть равно нулю");

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        test4 sp = new test4();
        double s,t;
        System.out.println("Введите рвсстояние ");
        s = scanner.nextInt();
        System.out.println("Введите время ");
        t = scanner.nextInt();
        sp.speed(s, t);
        }
    }

