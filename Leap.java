import java.util.Scanner;

public class Leap {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the year:");
        int year = input.nextInt();
        if((year%4==0 && year%100 !=0) || (year%400==0) ){
            System.out.printf("the entered year %d is leap year",year);
        }else{
            System.out.printf("the entered year %d is not leap year! \n",year);
            for(int i=1;i<4;i++){
                year +=i;
                if((year%4==0 && year%100 !=0) || (year%400==0) ) {
                    System.out.printf("the next leap year is %d ", year);
                }
                }
            }
        }


    }

