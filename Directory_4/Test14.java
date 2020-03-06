import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        int siz = 7;
        Scanner scanner = new Scanner(System.in);
        int[] z = new int[siz];
        for (int i = 0; i < z.length; i++) {
            System.out.println(i+" = ");
            z[i] = scanner.nextInt();
        }
        for (int i = 0; i < z.length; i++) {
            System.out.println("Массив " + i +" = " + z[i]);
        }
    }
}

