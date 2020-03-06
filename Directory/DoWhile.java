import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5");
        int value = scanner.nextInt();
        while (value != 5){
            System.out.println("Введите 5");
            value = scanner.nextInt();
        }
        System.out.println("Вы ввели 5");
        int i;
        do{
            System.out.println("Введите пжл 5");
            i = scanner.nextInt();
                    } while (i != 5);
        System.out.println("Наконец-то вы ввели 58");
    }
}
