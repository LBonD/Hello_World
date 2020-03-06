public class MultiArrays {
    public static void main(String[] args ){
        char[][] arr = new char[2][2];
        arr[0][0]= 'a';
        arr[0][1]= 'b';
        arr[1][0]= 'c';
        arr[1][1]= 'd';
        for(int i = 0; i< arr.length;i++){
            for (int j =0; j< arr[i].length; j++)
                System.out.println("Элемент с индексом" + i+ "," + j+ "=" + arr[i][j]);
        }
        int[][] gh = new int[9][9];
        for (int i = 0; i < gh.length; i++) {
            for (int j = 0; j < gh[i].length; j++)
                gh[i][j] = (i + 1) * (j + 1);
        }
        System.out.println("   1  2  3  4  5  6  7  8  9");
        for (int i = 0; i < gh.length; i++) {
            System.out.print((i + 1) + " "); // print место println
            for (int j = 0; j < gh[i].length; j++){
                if (gh[i][j] < 10 ) System.out.print(" "); // тоже print
                System.out.print(gh[i][j] + " ");// тоже print
            }
            System.out.println();
        }

    }
}
