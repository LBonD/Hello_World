package GB;

public class Variables {

    public static void main(String[] args) {
        byte b = 10;
        short s = 2210;
        int i = 43265456;
        long n = -922337209;
        float f = 5.9f;
        double d = 35.39;
        boolean bool = true; //false
        char c = 'D';
        String str = "My string";
        int number =10; //примитивный тип данных
        char charecter = 'a'; //примитивный тип данных
        String s ="Hello";//ссылочный тип данных; короткий способ написания нижней сторки
        String s1 = new String("Hello");//абсолютно равноценна предыдущей строке
        //Если создаем объекты класса, то только таким способом - new String


        b = 20; // TO MOVE this line you should press Ctrl+Shift and click on the UP or DOWN arrow
        String result = "";
        result += "Byte b = " + b + "\n";
        result += "Short s = " + s + "\n";
        result += "Int i = " + i + "\n";
        result += "Long n = " + n + "\n";
        result += "Float f = " + f + "\n";
        result += "Double d = " + d + "\n";
        result += "Boolean bool = " + bool + "\n";
        result += "Char c = " + c + "\n";
        result += "String str = " + str + "\n";
        System.out.print(result);


        String str_g = "54";
        int nf = Integer.parseInt(str_g) + 20;
        System.out.println(nf);
        System.out.println("Int nf = " + nf);

        String str_r = "39";
        int nfm = Integer.parseInt(str_r) + 50;
        System.out.println(nfm);
        System.out.print("Int nfm = " + nfm);


        String t = "53.5";
        Double mv = Double.parseDouble(t) + 12;
        System.out.println(mv);

        char k = 'E';
        int age = 0;
        age = age + 18;
        System.out.println("My Age: " +  age);


    }
}