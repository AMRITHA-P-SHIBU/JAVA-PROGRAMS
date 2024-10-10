package TUTORIAL_5;
import java.util.Scanner;
public class matrixIdentity {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("ENTER THE SIZE OF THE IDENTITY MATRIX(n FOR AN nxn matrix):");
		n=sc.nextInt();
		int mat1[][]=new int[n][n];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
                if(i==j) {
                    mat1[i][j]=1;
                }
                else {
                    mat1[i][j]=0;
                }
        	}
        }
        System.out.println("THE IDENTITY MATRIX IS:");
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		System.out.print(mat1[i][j]);
        		System.out.print("\t");
        	}
    		System.out.print("\n");
        }
        sc.close();
    }
}
