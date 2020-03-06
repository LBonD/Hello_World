package GB.lesson_1;

import javax.swing.*;

public class Hello_World_2 {

    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; i = i + 1)
            System.out.println("Hello World!!" + i);

        {

            String str = "World";
            JOptionPane.showMessageDialog(null, "Hello " +str+ " !!");

        }
    }
}
