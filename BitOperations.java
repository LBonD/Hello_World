package GB;

public class BitOperations {

    public static void main(String[] args) {
	int a = 4;
	int b = 7;
	String str_a = Integer.toBinaryString(a); // преображение в двоичный код
	String str_b = Integer.toBinaryString(b);
	System.out.println(" str_a = " + str_a);
		System.out.println(" str_b = " + str_b);
		System.out.println( str_a + " & " + str_b + " = " + (a & b)); // a * b
		System.out.println( str_a + " & " + str_b + " = " + Integer.toBinaryString(a & b));

		System.out.println( str_a + " | " + str_b + " = " + (a | b)); // a + b
		System.out.println( str_a + " | " + str_b + " = " + Integer.toBinaryString(a | b));
		System.out.println( str_a + " ^ " + str_b + " = " + Integer.toBinaryString(a ^ b));
		System.out.println( str_a + " ^ " + str_b + " = " + (a ^ b));

		System.out.println( " ~ " + str_b + " = " + Integer.toBinaryString(~b));
		System.out.println( " ~ " + b + " = " + ~b);
		System.out.println( str_b + " >>1 = " + Integer.toBinaryString(b>>1));
		System.out.println( str_b + " >>1 = " + (b>>1));
        System.out.println( str_b + " <<1 = " + Integer.toBinaryString(b<<1));
        System.out.println( str_b + " <<1 = " + (b<<1));
        int g = 5;
        int t = 10;
        String h_g = Integer.toBinaryString(g);
        String h_t = Integer.toBinaryString(t);
        System.out.println(" h_g =" + h_g);
        System.out.println(" h_t =" + h_t);
        System.out.println(h_g + " & " + h_t + " = " + (g & t));
        System.out.println(h_g + " & " + h_t + " = " + Integer.toBinaryString(g & t));
        System.out.println(h_g + " | " + h_t + " = " + Integer.toBinaryString(g | t));
        System.out.println(h_g + " | " + h_t + " = " + (g | t));
        System.out.println(h_g + " ^ " + h_t + " = " + Integer.toBinaryString(g ^ t));
        System.out.println(h_g + " ^ " + h_t + " = " + (g ^ t));
        System.out.println(" ~ " + h_g + " = " + Integer.toBinaryString(~g));
        System.out.println(" ~ " + h_g + " = " + (~g));
        System.out.println(h_g + " >>1 = " + Integer.toBinaryString(g>>1));
        System.out.println(h_g + " >>1 = " + (g>>1));
    }
}
