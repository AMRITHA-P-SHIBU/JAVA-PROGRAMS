package TUTORIAL_5;

import java.util.Scanner;

public class matrixMultiByScalar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows,cols;
		System.out.println("ENTER THE NO.OF ROWS IN THE 2D MATRIX):");
		rows=sc.nextInt();
		System.out.println("ENTER THE NO.OF COLOUMNS IN THE 2D MATRIX):");
		cols=sc.nextInt();
		int mat1[][]=new int[rows][cols];
        System.out.println("ENTER THE ELEMENTS:");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<cols;j++) {
        		mat1[i][j]=sc.nextInt();
        	}
        }
        System.out.println("THE MATRIX IS:");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<cols;j++) {
        		System.out.print(mat1[i][j]);
        		System.out.print("\t");
        	}
    		System.out.print("\n");
        }
        System.out.println("ENTER THE SCALAR VALUE TO MULTIPLY WITH THE MATRIX:");
        int scalar=sc.nextInt();
        sc.close();
        System.out.println("THE RESULTING MATRIX AFTER THE SCALAR MULTIPLICATION IS:");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<cols;j++) {
        		System.out.print(((mat1[i][j])*scalar));
        		System.out.print("\t");
        	}
    		System.out.print("\n");
        }
	}
}
