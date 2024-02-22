import java.awt.desktop.PrintFilesEvent;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Factors {
        public static void main(String[] args) {
            int count=0;
            int fact=1;
            Scanner input = new Scanner(System.in);
            System.out.print("enter a  number");
            try {
                int num =input.nextInt();


            for(int i=1;i<num;i++){
                fact *=i;
                if(num%i==0){
                    count +=i;


                }
            }
            if(num == count){
                System.out.println("the given number is a factor!");
            }
            else{
                System.out.println("its not a factor!");
            }
                System.out.print("factorials:"+fact*num);
            }catch (InputMismatchException e){
                System.out.println("enter only intiger numbers");
            }

    }
}
