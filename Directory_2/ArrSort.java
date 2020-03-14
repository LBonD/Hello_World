import java.util.Arrays;

// Java
public class ArrSort {
    public static void main(String[] args) {

        int[] a = new int[]{3, 2, 5};
        int[] b = {1, 6, 8};

        Arrays.sort(a);
        Arrays.sort(b);

        for (int j = 0; j < b.length - 1; j++) {
            for (int k = j + 1; k < b.length; k++) {
                if (b[j] < b[k]) {
                    int n = b[k];
                    b[k] = b[j];
                    b[j] = n;
                }
            }
        }
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; ++i) {
            c[i] = a[i] + b[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}
