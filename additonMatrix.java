package TUTORIAL_4;

import java.util.Scanner;

public class additonMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row1,col1,row2,col2;
		System.out.println("ENTER THE NO.OF ROWS OF ARRAY 1:");
		row1=sc.nextInt();
		System.out.println("ENTER THE NO.OF COLOUMNS OF ARRAY 1:");
		col1=sc.nextInt();
		int mat1[][]=new int[row1][col1];
		System.out.println("ENTER THE NO.OF ROWS OF ARRAY 2:");
		row2=sc.nextInt();
		System.out.println("ENTER THE NO.OF COLOUMNS OF ARRAY 2:");
		col2=sc.nextInt();
		int mat2[][]=new int[row2][col2];
		if(row1==row2&&col1==col2) {
        System.out.println("ENTER THE ELEMENTS OF ARRAY 1:");
        for(int i=0;i<row1;i++) {
        	for(int j=0;j<col1;j++) {
        		mat1[i][j]=sc.nextInt();
        	}
        }
        System.out.println("ENTER THE ELEMENTS OF ARRAY 2:");
        for(int i=0;i<row2;i++) {
        	for(int j=0;j<col2;j++) {
        		mat2[i][j]=sc.nextInt();
        	}
        }
        System.out.println("ARRAY 1:");
        for(int i=0;i<row1;i++) {
        	for(int j=0;j<col1;j++) {
        		System.out.print(mat1[i][j]+"\t");
        	}
        	System.out.print("\n");
        }
        System.out.println("ARRAY 2:");
        for(int i=0;i<row2;i++) {
        	for(int j=0;j<col2;j++) {
        		System.out.print(mat2[i][j]+"\t");
        	}
        	System.out.print("\n");
        }
        int mat3[][]=new int[row1][col1];
        for(int i=0;i<row1;i++) {
        	for(int j=0;j<col1;j++) {
        		mat3[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("SUM OF THE TWO ARRAYS:");
        for(int i=0;i<row1;i++) {
        	for(int j=0;j<col1;j++) {
        		System.out.print(mat3[i][j]+"\t");
        	}
        	System.out.print("\n");
        }
	   }
		else {
			System.out.println("ADDITION NOT POSSIBLE!");
		}
		sc.close();
	}
}
