import java.util.*;
public class user {
    public static void main(String[] args){
        int v;
        int l;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("enter a number:");

        int num =input.nextInt();
        if(num>0){
        while(num>0){
            v = num/10;
            l=num%10;
            System.out.print(l);
            num =v;
        }}
        else if(num<0) {
            while(num<0) {
                if(num<-10){
                    v = num/10;
                    l = (num%10)*-1;
                System.out.print(l);
                   num =v;
                } else if (num<0 && num >-10){
                    v =num/10;
                    System.out.print(num%10);
                    num=v;

                } else {
                    System.out.print(num);

                }
            }
            }
        else {
            System.out.println("enter positive or negative numbers only!");
        }


        }catch (InputMismatchException e){
            System.out.println("enter only numbers!");
        }
    }
}
