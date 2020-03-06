/*Написать метод, который выводит «Да»,
  если введенное число положительное или  «Нет»,
  если число отрицательное.*/


import java.util.Scanner;

public class Test1 {
    void hag (int i){
        if ( i > 0){
            System.out.println("Yes");
        } else System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        test1 one = new test1();
        System.out.println("Пожалуйста, введите целочисленное число ");
        int i = in.nextInt();
        one.hag(i);
    }
}
