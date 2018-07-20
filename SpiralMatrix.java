package io.javabrains.springbootstarter.coreJava.matrix;


import java.util.Scanner;

public class SpiralMatrix {
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

        System.out.println("Printing Spiral matrix:");
        int innerLoop, m, j, t = 0;

        if (row % 2 == 0) {
            innerLoop = row / 2;
        } else {
            innerLoop = row / 2 + 1;
        }
        for (int i = 0; i < innerLoop; i++) {
            for (j = i; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            col--;
            for (int k = i + 1; k < row; k++) {
                System.out.print(matrix[k][j-1] + " ");
            }
            row--;
            for (m = j - 2; m >= t; m--) {
                System.out.print(matrix[j-1][m] + " ");
            }
            m++;
            for (int n = j - 2; n > t; n--) {
                System.out.print(matrix[n][m] + " ");
            }
            t++;
        }
    }
}


