import java.util.InputMismatchException;
import java.util.Scanner;
public class vote {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("enter your age:");
        try {
            float age = input.nextFloat();
            if (age >= 18) {
                System.out.println("your are eligleble for vote!");
            } else if (age<0) {
                System.out.println("still u didn't born!");

            } else {
                System.out.println("your are not eligeble for vote! need " + (18 - age) + " years!");
            }
        }catch (InputMismatchException e){
            System.out.println("enter only intiger value!");
        }
    }
}
