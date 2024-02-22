
import java.util.*;
public class pattern {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("enter the num of rows:");
        int num = input.nextInt();
        for(int i=0;i<=num;i++){
            for(int j=i;j<num;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}