package TUTORIAL_3;

import java.util.Scanner;

public class reverseUsingWhile {

	public static void main(String[] args) {
		int n,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NO.OF DIGITS OF THE NUMBER:");
		n=sc.nextInt();
		System.out.println("ENTER THE NUMBER:");
		num=sc.nextInt();
		sc.close();
		int[] a=new int[n];
		for (int i =(n-1);i>=0;i--){
            a[i] = num % 10;
            num=num/10;
        }	
		int rev=0;
		for(int i=(n-1);i>=0;i--) {
			rev=rev*10+a[i];
		}
		System.out.println("THE REVERSED NUMBER:"+rev);
	}

}

