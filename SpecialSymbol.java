import java.util.Scanner;

public class SpecialSymbol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int special=0;
        System.out.print("enter the text:");
        String text =input.nextLine();
        char array[]=new char[text.length()];
        for(int i=0;i<text.length();i++){
            array[i]=text.charAt(i);
        }
        for(char v:array){
            if(!Character.isAlphabetic(v) && !Character.isWhitespace(v) && !Character.isDigit(v)){
                System.out.print(v);
                special++;
            }
        }
        System.out.println("\n"+special);
    }
}
