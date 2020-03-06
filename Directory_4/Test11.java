import java.util.Scanner;

public class Test11 {

public static void main(String[]args){

    Scanner in =new Scanner(System.in);

    double ves;
    double massa;

    System.out.print("Введите ваш вес (в кг)= ");
    massa=in.nextDouble();

    ves=(massa*17)/100;

    System.out.println("Ваш вес на Луне= "+ ves+" кг");
}
  }

