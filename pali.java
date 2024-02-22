import java.util.Scanner;

public class pali{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = input.nextInt();
        int k = num;
        int v = 0;
        if (num > 0) {
            while (num != 0) {
                int r = num % 10;
                v = v * 10 + r;
                num = num / 10;
            }
        }
        if (v == k) {
            System.out.print(v == k);
        } else {
            System.out.print(v == k);
        }
    }
}
