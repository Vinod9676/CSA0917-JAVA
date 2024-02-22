import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int rows=input.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<rows;j++){
                System.out.print("* ");
            }
            for(int j=i;j<rows-1;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
