import java.util.Scanner;

/*Создать целочисленный массив и заполнить его, результат вывести на экран.*/
public class Test10
{
    public static void main(String[] args) {
        System.out.println("Введите массив 3 раз ");
        int siz = 3;
        Scanner scanner = new Scanner(System.in);
        int[] z = new int[siz];
        for (int i = 0; i < z.length; i++) {
            z[i] = scanner.nextInt();
        }
        for (int i = 0; i < z.length; i++) {
            System.out.println("Массив = " + z[i]);
        }
    }
}

