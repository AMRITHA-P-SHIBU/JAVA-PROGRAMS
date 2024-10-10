package TUTORIAL_4;

import java.util.Scanner;

public class sumArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,n;
		System.out.println("ENTER THE NO.OF ELEMENTS OF THE ARRAY: ");
		n=sc.nextInt();
		sc.close();
		int intarray[]=new int[n];
		System.out.println("ENTER "+n+" ELEMENTS: ");
		int i;
		for(i=0;i<n;i++) {
			intarray[i]=sc.nextInt();
		}
		System.out.println("THE INTEGER ARRAY: ");
		for(i=0;i<n;i++) {
		System.out.print(intarray[i]+"\t");			
		}
		for(i=0;i<n;i++) {
			sum=sum+intarray[i];
		}
		System.out.println("\nSUM OF THE ELEMENTS OF THE INTEGER ARRAY:"+ sum);
	}
}

