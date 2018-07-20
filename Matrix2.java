package io.javabrains.springbootstarter.coreJava.matrix;


import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix row size");
        int row = sc.nextInt();
        System.out.println("Enter matrix column size");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        System.out.println("Enter matrix value:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("Printing new matrix:");
        int m, j, i=0;

        for (j = 0; j < col; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        for (int k = 1; k < row; k++) {
            System.out.print(matrix[k][j - 1] + " ");
        }
        for (m = j - 2; m >= i; m--) {
            System.out.print(matrix[j-1][m] + " ");
        }

        int newRow=row-2;
            for(int x=0; x<row-2; x++){
                int y;
                for(y=0; y<col-1; y++){
                    System.out.print(matrix[newRow][y]+" ");
                }
                x++;
                newRow--;
                System.out.println();
                for(y=y-1; y>=0 && newRow !=0 ; y--){
                    System.out.print(matrix[newRow][y]+" ");
                }
                newRow--;
                System.out.println();
            }
    }
}



