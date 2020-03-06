package GB;

public class CycleDoWhile {

    public static void main(String[] args) {
	int a =5;
	while (a > 10) {
	    System.out.println("Мы в цикле While!");
    } do {
            System.out.println("Мы в цикле do-While!");
        } while (a > 5);
	a =0;
	while(true) {
	    a++;
	    if (a == 10) break;
	    if (a % 2 == 0) continue;
	    System.out.println(a);
    }

    }
}
