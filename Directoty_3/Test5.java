/*Написать метод, который анализирует ваш возраст и
  в зависимости от этого выдает к какой возрастной категории вы относитесь.
 (Молодой, Среднего возраста или пожилой).*/

import java.util.Scanner;

public class Test5 {
    void age(int i) {
        if (i < 36) {
            System.out.println("Вы Молодой человек ");
        } else if (i > 65) {
            System.out.println("Вы Пожилой человек");
        }else if ((i >36 )& (i<65)) System.out.println("У Вас Средний возраст ");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        test5 people = new test5();
        System.out.println("Введите ваш возраст ");
        int i = scanner.nextInt();
        people.age(i);


    }
}

