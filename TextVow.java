import java.util.Scanner;

public class TextVow {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter a Text:");
        String Text=input.nextLine();
        for(int i=0;i<Text.length();i++){
            if( Text.charAt(i)=='a' || Text.charAt(i)=='e' || Text.charAt(i)=='i' || Text.charAt(i)=='o' || Text.charAt(i)=='u' ||
                    Text.charAt(i)=='A' || Text.charAt(i)=='E' || Text.charAt(i)=='I' || Text.charAt(i)=='O' || Text.charAt(i)=='U'){
                continue;
            }
            else {
                System.out.print(Text.charAt(i));
            }
        }

    }
    }
