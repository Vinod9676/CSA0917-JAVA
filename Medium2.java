import java.util.Scanner;

public class Medium2 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String grade="";
        System.out.println("enter the num of subjects:");
        int subs =input.nextInt();
        String[] subjects =new String[subs];
        System.out.println("enter the name of subjects:");
        for(int i=0;i<subs;i++){
            subjects[i]=input.next();
        }
        int[] marks=new int[subs];

        for(int i=0;i<subs;i++){
            System.out.print("enter the marks "+subjects[i]+":");
            marks[i]=input.nextInt();
        }
        int total=0;
        for(int i=0;i<subs;i++){
            total +=marks[i];
        }
        float percent =(total/(float)subs);
        if(percent>75){
            grade ="DISTINCTION";
        }
        else if( percent >=60  ){
            grade ="SECOND DEVESION";
        } else if (percent>=50) {
            grade ="THIRD  DEVESION";
        }
        else{
            grade ="FAIL!";
        }

        System.out.println("TOTAL:"+total);
        System.out.println("Aggregate :"+percent);
        System.out.println(grade);


    }
}
