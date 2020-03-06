import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("Как вас зовут(введите только имя)?");
        String name = scanner.nextLine();
        System.out.println("Ваше имя: "+ name);
        System.out.println();
        System.out.println("Сколько вам лет?");
        int input = scanner.nextInt();
        System.out.println("Ваш возраст: "+ input);
        System.out.println();
        System.out.println("Привет,"+ name + " Меня зовут Саша. Мне тоже " + input +" лет. =)");

    }
}
