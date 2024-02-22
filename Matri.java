import java.util.Scanner;

public class Matri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the num of rows for first matrix row:");
        int firstrow = input.nextInt();
        System.out.println("enter the num of rows for first matrix Colomus:");
        int firstcoloum = input.nextInt();

        System.out.println("enter the num of rows for Second matrix row:");
        int secondrow = input.nextInt();

        System.out.println("enter the num of rows for Second matrix Coloum:");
        int secondcoloum = input.nextInt();

        int[][] firstMatrix = new int[firstrow][firstcoloum];

        int[][] Secondmatrix = new int[secondrow][secondcoloum];

        int[][] MultiplicationMatrix = new int[firstrow][secondcoloum];

        System.out.println("enter first matrix value");
        for (int i = 0; i < firstrow; i++) {
            for (int j = 0; j < firstcoloum; j++) {
                firstMatrix[i][j] = input.nextInt();
            }
        }
        System.out.println("enter Second matrix value");
        for (int i = 0; i < firstrow; i++) {
            for (int j = 0; j < firstcoloum; j++) {
                Secondmatrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < firstrow; i++) {
            for (int j = 0; j < firstcoloum; j++) {
                for (int h = 0; h < firstcoloum; h++) {

                    MultiplicationMatrix[i][j] += firstMatrix[i][h] * Secondmatrix[h][j];
                }
            }
        }

        System.out.println("multiplication matrix");

        for (int i = 0; i < firstrow; i++) {
            for (int j = 0; j < firstcoloum; j++) {

                System.out.print(MultiplicationMatrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}