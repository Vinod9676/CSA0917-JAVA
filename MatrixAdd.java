import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the num of rows for first matrix row:");
        int firstrow =input.nextInt();
        System.out.println("enter the num of rows for first matrix Colomus:");
        int firstcoloum =input.nextInt();

        System.out.println("enter the num of rows for Second matrix row:");
        int secondrow =input.nextInt();

        System.out.println("enter the num of rows for Second matrix Coloum:");
        int secondcoloum =input.nextInt();

        int[][] firstMatrix =new int[firstrow][firstcoloum];

        int[][] Secondmatrix =new int[secondrow][secondcoloum];

        int[][] AdditionMatrix =new int[firstrow][secondcoloum];

        System.out.println("enter first matrix value");
        for(int i=0;i<firstrow;i++){
            for(int j=0;j<firstcoloum;j++){
                firstMatrix[i][j]=input.nextInt();
            }
        }
        System.out.println("enter Second matrix value");
        for(int i=0;i<firstrow;i++){
            for(int j=0;j<firstcoloum;j++){
                Secondmatrix[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<firstrow;i++){
            for(int j=0;j<firstcoloum;j++){
                AdditionMatrix[i][j]=firstMatrix[i][j]+Secondmatrix[i][j];
            }
        }

System.out.println("Addition matrix");

        for(int i=0;i<firstrow;i++){
            for(int j=0;j<firstcoloum;j++){
                System.out.print(AdditionMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
