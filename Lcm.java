import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the num of divisiors:");
        int div =input.nextInt();
        int list[]=new int[div];
        for(int i=0;i<div;i++){
            list[i]=input.nextInt();

        }
        int max_value=0;
        for(int j=0;j<div;j++){
            if(max_value<list[j]){
                max_value =list[j];
            }
        }
        int lc=0;
        for(int j=0;j< list.length;j++){
            if(j+1<list.length){
                for(int k=1;k<max_value;k++) {
                    if(list[j]%k==0 && list[j+1]%k==0){
                        lc=k;
        }
        }

        }
        }
System.out.println(lc);
    }

}
