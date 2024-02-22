import java.util.Scanner;
public class Valid {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the name:");
        String name = input.nextLine();
        System.out.print("re-enter the name:");
        String name2 = input.nextLine();
    if(name == name2){
        System.out.println("User name is Valid");
    }
    else{
        System.out.println("User name is Invalid!");
    }

    }
}
