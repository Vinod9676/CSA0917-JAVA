import java.util.Scanner;

public class CharaCter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a Text:");
        String Text = input.nextLine();
        System.out.print("enter a Text:");
        char ch = input.next().charAt(0);
        for(int i=0;i<Text.length();i++){
            if(Text.charAt(i)==ch){
                System.out.println("Search CHaracter"+ch+"present in index:"+i);
            }else {
                System.out.println("Search CHaracter"+ch+"doesnot present in the String");

            }
        }

    }
}