public class Test21
{
    public static void main(String[] args) {
        int year = 2020;

        boolean isLeap;
        if(year % 400 ==0){
            isLeap = true;
        }else if (year % 100 ==0){
            isLeap = false;
        }else if (year % 4 == 0){
            isLeap = true;
        }else {
            isLeap = false;
        }




        if((year % 400 ==0) || (year % 100 !=0) && (year % 4 == 0)){
            isLeap = true;
        }else isLeap = false;



        isLeap =(year % 400 ==0) || (year % 100 !=0) && (year % 4 == 0);


        System.out.println(isLeap ? year + " is leap year" : " is not leap year");
    }
}
