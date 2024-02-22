import java.util.Scanner;

public class Composite {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the starting number:");
        int start=input.nextInt();
        System.out.print("enter the ending number:");
        int end=input.nextInt();
        for (int i = start; i <end ; i++) {
            for(int j=2;j<end;j++){
                if(i%j==0 && i !=j ){
                    System.out.print(i+" ");
                    break;
                }
            }

        }

    }

}
