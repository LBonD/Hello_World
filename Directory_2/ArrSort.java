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
        System.out.println(Arrays.toString(c));
    }
}


//        System.out.println(Arrays.toString(a));
//                System.out.println(Arrays.toString(b));


                //    int a = 120;
//    int b = 100;
//    int c;
//        for (int i = 0; i < c.length; i++)
//        {
//            a[i] = c[i] + intArray[i];
//        }

                //      Arrays.sort(с);
//
//    a = a +b/2;
//                String address="255.100.50.0";
//                address=address.replace(".","[.]");
//
//                System.out.println(address);
////        if(b <a/2){
//        c = b + a;
//    }else c = b + a/2;
//
//        System.out.println(c);


                //       Arrays.setAll(a,intArray -> (a +intArray));


//        int size = a.length;
//        int[] reversed = new int[size];
//        Arrays.setAll(reversed, i -> a[size - i - 1]);
                //       int[] c = new int[3];
                //       int aI = 0;
//        int bI = 0;
////        int is = 0;
//        for (int i=0; i < c.length;i++) { //is+= a[0] ;// is+= c[i]+b[i];
//            if (aI == a.length && bI < intArray.length) {
//                c[i] = intArray[i]+a[i];
//            } else if (bI == intArray.length && aI < a.length) {
//                c[i] = a[i]+intArray[i];
//            } else if (bI == b.length && aI == a.length) {
//                break;
//            } else if (a[aI] < b[bI]) {
//                c[i] = a[aI++];
//            } else if (a[aI] == b[bI]) {
//                c[i] = b[bI++];
//                aI++;
//            } else if (a[aI] > b[bI]) {
//                c[i] = b[bI++];
//            }
//            i++;
//        }
//        int[] result = new int[i];
//        System.arraycopy(c, 0, result, 0, i);
//
//        System.out.println("result:" + Arrays.toString(result));
//
//
//
//                int[] a1 = {1,2,3,4,5};
//                int[] b = {6,7,8,9,10,11};
//                Random r = new Random();
//
//                int len;
//
//                if (a1.length > b.length) len = b.length;
//                else len = a1.length;
//
//                int[] c1 = new int[len];
//
//                for(int i1 =0;i1<len;i1++){
//                    if (r.nextInt(2) == 1) c1[i1] = a1[i1] + b[i1];
//                    else c1[i1] = a1[i1] - b[i1];
//                }
//
//                System.out.println(Arrays.toString(c1));

//        int []c  = new int[2];
//        for(int i = 0; i < c.length; i++){
//            a[i] = c[i]+b[i];
//        }
                //       System.out.println(a);


//    int a = 120;
//    int b = 100;
//    int c;
//
//    a = a +b/2;
//        if(b <a/2){
//        c = b + a;
//    }else c = b + a/2;
//
//        System.out.println(c);
//

//(1 - i)^3 *2(1 - i)^2 + 5(1 - i) = (1 - i)*((1 - i)^2 - 2(1 - i) +5) = (1 - i) *(1 - 2i + i^2 - 2 + 2i +5) = (1 - i) +(4 +i^2)