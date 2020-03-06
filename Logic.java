package GB;

public class Logic {

	public static void main(String[] args) {
		Boolean b_1 = true; //1
		Boolean b_2 = false; //0
		Boolean b_3 = false;

		System.out.println(b_1 + " && " + b_2 + " = " + (b_1 && b_2)); // 1 * 0
		System.out.println(b_2 + " && " + b_1 + " = " + (b_2 && b_1));
		System.out.println(b_2 + " && " + b_3 + " = " + (b_2 && b_3));
		System.out.println(b_1 + " || " + b_2 + " = " + (b_1 || b_2)); // 1 + 0
		System.out.println(b_3 + " || " + b_2 + " = " + (b_3 || b_2)); // 1 + 0
		System.out.println(b_2 + " ^ " + b_1 + " = " + (b_2 ^ b_1));// true будет тогда и только тогда, когда значение операндов будут различны
		System.out.println(b_3 + " ^ " + b_2 + " = " + (b_3 ^ b_2));// " ^ " true будет тогда и только тогда, когда значение операндов будут различны
		System.out.println("!" + b_1 + " = " + b_1);
		System.out.println("!" + b_1 + " = " + !b_1);
		System.out.println("!" + b_2 + " = " + !b_2);

	}
}
