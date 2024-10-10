package TUTORIAL_5;
import java.util.Scanner;
public class matrixSymmetry {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("ENTER THE SIZE OF THE SQUARE MATRIX(n FOR AN nxn matrix):");
		n=sc.nextInt();
		int mat1[][]=new int[n][n];
        System.out.println("ENTER ELEMENTS OF THE MATRIX:");
        for(int i=0;i<(n);i++) {
        	for(int j=0;j<(n);j++) {
        		mat1[i][j]=sc.nextInt();
        	}
        }
        System.out.println("THE MATRIX IS:");
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		System.out.print(mat1[i][j]);
        		System.out.print("\t");
        	}
    		System.out.print("\n");
        }
        int trans[][]=new int[n][n];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		trans[i][j]=mat1[j][i];
        	}
        }
        int count=0;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(mat1[i][j]==trans[i][j]) {
        			count++;
        	    }
        	}
        }
        if(count==(n*n)) {
        	System.out.println("THE MATRIX IS SYMMETRIC.");
        }
        else {
        	System.out.println("THE MATRIX IS NOT SYMMETRIC");
        }
        sc.close();
	}
}
