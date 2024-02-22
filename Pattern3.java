import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("enter the number you want to print:");
        int k=input.nextInt();
        System.out.println("enter num of rows");
        int rows=input.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<i;j++ ){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(int i=0;i<rows;i++){
            for(int j=i;j<rows;j++ ){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
