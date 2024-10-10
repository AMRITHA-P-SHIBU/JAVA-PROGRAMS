package TUTORIAL_4;

import java.util.Scanner;

public class searchArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows,cols,i,j;
		System.out.println("ENTER THE NO.OF ROWS IN THE 2D ARRAY:");
		rows=sc.nextInt();
		System.out.println("ENTER THE NO.OF COLOUMNS IN THE 2D ARRAY:");
		cols=sc.nextInt();
		int arr[][]=new int[rows][cols];
        System.out.println("ENTER THE ELEMENTS INTO THE ARRAY:");
        for(i=0;i<rows;i++) {
        	for(j=0;j<cols;j++) {
        		arr[i][j]=sc.nextInt();
        	}
        }
        System.out.println("THE ARRAY IS:");
        for(i=0;i<rows;i++) {
        	for(j=0;j<cols;j++) {
        		System.out.print(arr[i][j]);
        		System.out.print("\t");
        	}
    		System.out.print("\n");
        }
        int x;
        System.out.println("ENTER THE ELEMENT TO BE SEARCHED:");
        x=sc.nextInt();
        for(i=0;i<rows;i++) {
        	for(j=0;j<cols;j++) {
        		if(arr[i][j]==x) {
        	        System.out.println("ELEMENT FOUND AT POSITION ("+i+","+j+")" );
        		}
        	}
        }
	}
}
