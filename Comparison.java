package GB;

public class Comparison {

    public static void main(String[] args) {
	int a =5;
	int b = 9;
	int c = 6;
	System.out.println(a + " < " + b + " = " + (a < b));
	System.out.println(a + " > " + b + " = " + (a > b));
	System.out.println(a + " <= " + c + " = " + (a <= c));
	System.out.println(b + " >= " + c + " = " + (b >= c));
	System.out.println(b + " = " + c + " = " + (b == c));
	System.out.println(b + " == " + c + " = " + (b == c));
	System.out.println(b + " != " + c + " = " + (b != c));
	System.out.println(b + " != " + b + " = " + (b != b));

	Double s = 7.5;
	Double g = 4.9;
	System.out.println( s + " < " + g + " = " + (s<g));
	System.out.println( s + " > " + g + " = " + (s>g));
	System.out.println( s + " <= " + g + " = " + (s<=g));
	System.out.println( s + " >= " + g + " = " + (s>=g));
	System.out.println( s + " == " + g + " = " + (s==g));
	System.out.println( s + " != " + g + " = " + (s!=g));


    }
}
