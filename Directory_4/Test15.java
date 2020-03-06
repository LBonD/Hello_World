import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test15 {
    public static void main(String[] args) {
        {
            int a = 2;
            double b = 1.1;
            double c = a - b;
            System.out.println(c);
        }

        {


            BigDecimal a = new BigDecimal("2");
            BigDecimal b = new BigDecimal("1.1");
            BigDecimal c = a.subtract(b);
            System.out.println(c);
        }

        System.out.println(22/7);
        System.out.println(22./7.);
        System.out.println(new BigDecimal("22").setScale(50).divide(new BigDecimal("7"), RoundingMode.HALF_UP));
        var a = 1;
        var b = ++a;
        var c = a++;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        var v = 2;
        v += 8;
        v *= 10;
        v /= 25;
        v %= 4;

        System.out.println(v);
    }
}
