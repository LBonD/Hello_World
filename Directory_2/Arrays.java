public class Arrays {
    public static void main(String [] args ){
      int number =10;//примитивный тип данных      // [10]
      int [] numbers = new int[5];               // numbers -> [массив]   Ссылочный тип данных
      //System.out.println(numbers [0]) // numbers[0]=20 ; НО если массив из 100 элементов и больше, то лучще использовкать цикл for
      for(int i = 0; i < numbers.length; i++){//очень удобно подходит для инициализации массива
          numbers[i]= i*10;
      }
      for(int i =0; i<numbers.length; i++){
          System.out.println(numbers[i]);
      }
        System.out.println();
      int [] numbers1 ={2,4,6};
      for(int i = 0; i<numbers1.length; i++){
          System.out.println(numbers1[i]);
      }

    }

}
