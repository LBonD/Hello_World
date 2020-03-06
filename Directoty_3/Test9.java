import java.util.Scanner;

//
///*Создать целочисленный массив и заполнить его, результат вывести на экран.*/
public class Test9
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите массив 5 раз");
        int[] m = new int[5];

        for (int i = 0; i < m.length; i++) {
            m[i] = scanner.nextInt();
        }
        System.out.println("Среднее значения массива: " + SrZnach(m));
        System.out.println("Максимальный элемент массива: " + SearchMax(m));
        System.out.println("Минимальный элемент массива: " + SearchMin(m));
    }

    public static int SrZnach(int[] m) {
        int sr;
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum = sum + m[i];
        }
        sr = sum / m.length;
        return sr; // СРЕДНЕЕ ЗНАЧЕНИЕ МАССИВА
    }

    public static int SearchMax(int[] m) {
        int max = m[0];
        for (int i = 0; i < m.length; i++) {
            if (max < m[i]) {
                max = m[i];
            }
        }
        return max; // MAX ЗНАЧЕНИЕ
    }

    public static int SearchMin(int[] m) {
        int min = 0;
        int a;
        for (int i = 0; i < m.length; i++) {
            if (m[min] > m[i]) {
                min = i;
            }
        }
        a = m[min];
        return a; // MIN ЗНАЧЕНИЕ
    }
}


