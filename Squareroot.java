import java.util.Scanner;

public class Squareroot {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("enter a number:");
        int fact=input.nextInt();
        float pf_sq=(float) Math.sqrt(fact);
        System.out.print("perfect square number is:"+pf_sq);

    }
}
