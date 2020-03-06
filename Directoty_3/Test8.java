import java.util.Scanner;

/*Написать программу, которая получает символы, введенные с клавиатуры,
  до тех пор, пока не встретитися точка. Также нужно создать счетчик пробелов.
  Сведения о количестве прбелов должны выводиться в конце программы.*/
public class Test8 {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    str = str.substring(0,str.indexOf('.'));
    System.out.println("Текст до точки " + str);
    int b = str.split(" ").length;
    System.out.println("Колличество пробелов " + b);

}}
