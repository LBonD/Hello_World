public class ArraysOfStrings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];// три объекта класса стринг
        strings[0] = "Привет!";
        strings[1] = "Пока!";
        strings[2] = "Java!";
        System.out.println(strings[0]);
        System.out.println(strings[2]);
        System.out.println();

        for(int i= 0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
        System.out.println();
        for(String string:strings) { //forEach
            System.out.println(string);
        }
        int[] numbers1 = {1,2,3};
        int sum =0; //посчитаем сумму
        for(int x:numbers1){
            sum+=x;
        }
        System.out.println();
        System.out.println(sum);

        int value =0;//грубо говоря - коробка в которую помещаем число
        String s; //когда мы просто декларируем переменнуб s, то не выделяется память под строку. здесь выделяем память под ссылку(null) на какую-то строку




    }
}
