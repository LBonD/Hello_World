package GB;

public class Array {

    public static void main(String[] args) {
        int[] ar = new int[5];
        ar[0] = 10;
        ar[1] = 7;
        ar[2] = 20;
        ar[3] = 30;
        ar[4] = 13;
        System.out.println("Элемент с индексом  1 = " + ar[1]);

        double[] d_ar = new double[20];
        for (int i = 0; i < d_ar.length; i++)
        d_ar[i] = Math.random();
        for (int i = 0; i < d_ar.length; i++)
            System.out.println(d_ar[i]);

        String[] s_ar = {"A, B, C"};
        for (int i = 0; i < s_ar.length; i++)
            System.out.println(s_ar[i]);
        int max =ar[0];
        for(int i = 1; i < ar.length; i++) {
        if (ar[i]> max) max = ar[1];
                }
        System.out.println("MAX значение в массиве ar = " + max);
        double[] de = {1,2,3,4,5};
        int sum =0;
        int i=1;
        while( i<5){
            sum+=i;
            i++;
        }
        System.out.println("Summa" + i);


    }
}
