package io.javabrains.springbootstarter.coreJava.matrix;


import java.util.Scanner;

public class ReverseMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter row: ");
        int row=sc.nextInt();
        System.out.println("Enter column: ");
        int col=sc.nextInt();
        int[][] matrix = new int[row][col];

        System.out.println("Enter matrix value");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Printing matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //Logic for reverse matrix
        System.out.println("printing reverse matrix");
        for(int i=col-1; i>=0;i--){
            int j;
            for(j=0; j<row;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
            i--;
            for(int k=j-1;k>=0 && i>=0;k--){
                System.out.print(matrix[k][i]+" ");
            }
            System.out.println();
        }
    }
}
