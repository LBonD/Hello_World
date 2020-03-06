import java.util.Scanner;
/*Перевернуть написанную строку(любую),то есть например из строки «привет мир» получить «рим тевирп»*/
public class Test13 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String str1 = new String();
        System.out.println("Введите строчку ");
        str1 = scanner.nextLine();
        String str2 = new StringBuffer(str1).reverse().toString();
        System.out.println("Обратное этой строчки: " + str2);
        System.out.println(str1 + " = " + str2);

    }
}







