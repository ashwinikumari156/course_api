package io.javabrains.springbootstarter.coreJava.matrix;


import java.util.Scanner;

public class SearchWordIn2DGrid {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter row");
        int row=sc.nextInt();
        System.out.println("enter column");
        int col=sc.nextInt();
        String[][] matrix=new String[row][col];
        System.out.println("enter matrix value");
        for(int i=0; i<row; i++){
            for(int j=0;j<col; j++){
                matrix[i][j]=sc.next();
            }
        }

        System.out.println("printing matrix");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("enter word to search");
        String word=sc.next();

        //Logic for searching word from 2D matrix
        int wordLength=word.length();//3
        char[] wordChar=word.toCharArray();
        int i=0;
        while(col-1>=0){
            //if(ma)
        }


    }
}
