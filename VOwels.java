import java.util.Scanner;

public class VOwels {
    public static void main(String[] args) {
        int vow =0,cons=0,space=0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a text:");
        String text = input.nextLine();
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) == 'A') || (text.charAt(i) == 'E') || (text.charAt(i) == 'I') || (text.charAt(i) == 'O') || (text.charAt(i) == 'U')
                    || (text.charAt(i) == 'a') || (text.charAt(i) == 'e') || (text.charAt(i) == 'i') ||
                    (text.charAt(i) == 'o') || (text.charAt(i) == 'u')) {
                vow++;
            }
            else if(Character.isWhitespace(text.charAt(i))){
                space++;
            }
            else{
                cons++;
            }
        }
        System.out.println("no.of vowels is:"+vow);
        System.out.println("no.of consonents is:"+cons);


    }
}
