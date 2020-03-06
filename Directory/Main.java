package GB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner s = new Scanner (System.in);// чтобы импортировать, нажми Alt+Enter
        System.out.println("Введите что-нибудь");
        String string = s.nextLine();  // в переменной string храниться то, что мы ввели с клавиатуры
        System.out.println("Вы ввели " +  string);
        System.out.println(" Введите какое-нибудь число:");
        int i = s.nextInt() ;
        System.out.println("Вы ввели" + i);
    }

}
