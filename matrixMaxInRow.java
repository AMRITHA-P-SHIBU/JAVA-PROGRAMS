package TUTORIAL_5;

import java.util.Scanner;

public class matrixMaxInRow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows,cols;
		System.out.println("ENTER THE NO.OF ROWS IN THE MATRIX):");
		rows=sc.nextInt();
		System.out.println("ENTER THE NO.OF COLOUMNS IN THE MATRIX):");
		cols=sc.nextInt();
		int mat1[][]=new int[rows][cols];
        System.out.println("ENTER THE ELEMENTS OF THE MATRIX:");
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
        System.out.println("MAXIMUM ELEMENT IN EACH ROW:");
        for(int i=0;i<rows;i++) {
            int large=mat1[i][0];
            for(int j=1;j<cols;j++) {
                if(mat1[i][j]>large) {
                    large=mat1[i][j];
                }
            }
        System.out.println("ROW "+(i+1)+": "+large);
        }
        sc.close();
	}
}
