import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class LcmGcd {
    public static void main(String[] args) {
        int mul = 1;
        int max_list = 0;
        int lc=1;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the no of divisiors:");
        int div = input.nextInt();
        int[] list = new int[div];
        for (int i = 0; i < div; i++) {
            System.out.println("enter the divisors:");
            int divisors = input.nextInt();
            list[i] = divisors;
            lc *=divisors;
        }
        Arrays.sort(list);
        for (int k = 0; k < div-1; k++) {
            if (max_list < Math.max(list[k], list[k + 1])) {
                max_list = Math.max(list[k], list[k + 1]);
            }
        }
        for (int k = 0; k < div; k++){
            if((k+div)<=div){

                for(int j=1;j<max_list/2;j++){
                    if(list[k]%j==0 && list[k+1]%j==0){
                        mul =j;
                    }
                }}
        }
        int lcm=lc/mul;
        System.out.println("gcd is:"+mul);
        System.out.println("Lcm is:"+lcm);

    }}