import java.util.Scanner;

public class Medium1 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int choice,rev=0,rem,b;
        String v ="";

        System.out.println("Choice:1 = palindrome for String:");
        System.out.println("Choice:1 = palindrome for num:");
        System.out.print("enbter the choice:");
    try {
        choice =input.nextInt();
        switch (choice){
            case 1:
                System.out.println("enter the string:");
                String l=input.next();
                for(int i=l.length()-1;i>=0;i--){
                    v +=l.charAt(i);
                }
                System.out.println(l);
                System.out.println(v);
                if(v.equals(l)){
                    System.out.println("PALINDROME!");
                }else{
                    System.out.println("NOT PALINDROME");
                }break;
            case 2:
                System.out.println("enter the num:");
                int a=input.nextInt();
                int d=a;
                while (a!=0){
                    rem=a%10;
                    rev =rev*10+rem;
                    a =a/10;
                }
                System.out.println(rev);
                if(d==rev){
                    System.out.println("PALINDROME!");
                }else{
                    System.out.println("NOT PALINDROME");
                }break;
            default:
                System.out.print("enter only case 1 or case 2!");

        }
    }catch (Exception e){
        System.out.print("enter only intigers");
    }

    }
}
