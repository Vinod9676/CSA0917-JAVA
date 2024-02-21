import java.util.Scanner;

public class stack
{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=1;
        System.out.println("enter the num of rows");
        int rows =input.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=i;j<rows;j++){
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++){
                if(k==0 || k==i){
                num=1;
                } else {
                    num =num*(i-k+1)/k;

                }
                System.out.print(num+"  ");
            }
            System.out.println();
        }
    }
}
