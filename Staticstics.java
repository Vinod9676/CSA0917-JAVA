import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Staticstics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mean = 0;
        int[] elements = {0, 160, 180, 270, 160, 230, 210, 190, 0};
        for (int i = 0; i < elements.length; i++) {
            mean += elements[i]/elements.length;
        }
        System.out.println("mean: " + mean);
        Arrays.sort(elements);
        float mid = (elements.length)/2;
        int median = (int) Math.ceil(mid);

        System.out.println("median: "+elements[median]);
        int mode=0,num=0;

        for(int i=0;i<elements.length;i++) {
            int cons=0;
            for(int j=i+1;j<elements.length;j++){
                if(elements[i]==elements[j]){
                    cons++;
                    if(num<cons){
                        num =cons;
                        mode +=i;
                    }

                }
            }
        }
        System.out.println("mode: "+elements[mode]);

    }
}