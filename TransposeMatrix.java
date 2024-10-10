package TUTORIAL_4;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows,cols;
		System.out.println("ENTER THE NO.OF ROWS OF THE MATRIX:");
		rows=sc.nextInt();
		System.out.println("ENTER THE NO.OF COLOUMNS OF THE MATRIX:");
		cols=sc.nextInt();
		sc.close();
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
        int trans[][]=new int[rows][cols];
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<cols;j++) {
        		trans[i][j]=mat1[j][i];
        	} 
        }
        System.out.println("TRANSPOSE OF THE MATRIX:");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<cols;j++) {
        		System.out.print(trans[i][j]);
        		System.out.print("\t");
        	}
    		System.out.print("\n");
        }
	}
}
