import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] b2 = {6, 7, 8, 9, 10, 11};
        Random r = new Random();

        int len;

        if(a1.length>b2.length)len=b2.length;
        else len=a1.length;

        int[]c1=new int[len];

        for(int i1=0;i1<len; i1++){
            if(r.nextInt(2)==1)c1[i1]=a1[i1]+b2[i1];
            else c1[i1]=a1[i1]-b2[i1];
        }

        System.out.println(Arrays.toString(c1));


    }
}
