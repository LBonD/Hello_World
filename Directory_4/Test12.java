import java.util.Scanner;

/*Написать программу, для поиска максимального и минимального элемента массива.
  Массив чисел задается с клавиатуры.*/

public class Test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите элемент массива № " + i + " из" + m.length);
            m[i] = scanner.nextInt();
        }
        int max, min, maxi = 0, mini = 0;
        max = min = m[0];
        for (int i = 0; i < 5; i++) {
            if (m[i] > max) {
                max = m[i];
                maxi = i;
            }
            if (m[i] < min) {
                min = m[i];
                mini = i;
            }
        }
        System.out.println("Минимальный элемент массива   = "+ max + " Это "+ maxi + " Элемент массива" );
        System.out.println("Максимальный элемент массива = " + min + " Это " + mini + " Элемент массива");
    }
    }

