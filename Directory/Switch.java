import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст ");
        int age = scanner.nextInt();
        if (age == 10) {
            System.out.println("Ты учишься школе"); // очень много if
        } else if(age == 18) {                      // поэтому есть switch
            System.out.println("Ты закончил школу");// чтобы не писать столько условий
        } switch (age){
            case 0:
                System.out.println("Ты родился ");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
            default://в том случае, когда ни одно из предыдущих не выполнилось
                System.out.println("Ни одно из предыдущих не подошло");

        }

    }
}
