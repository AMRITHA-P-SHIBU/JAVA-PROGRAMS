package TUTORIAL_4;
import java.util.Scanner;
public class diagonalSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("ENTER THE SIZE OF THE SQUARE MATRIX(n FOR AN (nxn) MATRIX):");
		n=sc.nextInt();
		int mat1[][]=new int[n][n];
        System.out.println("ENTER "+(n*n)+" ELEMENTS:");
        for(i=0;i<(n);i++) {
        	for(j=0;j<(n);j++) {
        		mat1[i][j]=sc.nextInt();
        	}
        }
        System.out.println("THE MATRIX IS:");
        for(i=0;i<n;i++) {
        	for(j=0;j<n;j++) {
        		System.out.print(mat1[i][j]);
        		System.out.print("\t");
        	}
    		System.out.print("\n");
        }
        int sum1=0;
        for(i=0;i<n;i++) {
        	for(j=0;j<n;j++) {
        		if(i==j) {
        			sum1=sum1+mat1[i][j];
        		}
        	}
        }
        System.out.println("SUM OF ELEMENTS OF THE FIRST DIAGONAL:"+sum1);
        int sum2=0;
        for(i=0;i<n;i++) {
        	for(j=(n-1);j>=0;j--) {
        		if(j==n-1-i) {
        			sum2=sum2+mat1[i][j];
        	    }
            }
        }
        System.out.println("SUM OF ELEMENTS OF THE SECOND DIAGONAL:"+sum2);
	}
}
