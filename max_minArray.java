package TUTORIAL_4;
import java.util.Scanner;
public class max_minArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,max,min;
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
		max=intarray[0];
		for(i=1;i<n;i++) {
			if(intarray[i]>max) {
				max=intarray[i];
			}}
		System.out.println("\nMAXIMUM ELEMENT OF THE ARRAY:" +max);
		min=intarray[0];
		for(i=1;i<n;i++) {
			if(intarray[i]<min) {
				min=intarray[i];
			}}
		System.out.println("MINIMUM ELEMENT OF THE ARRAY:" +min);
	}}
