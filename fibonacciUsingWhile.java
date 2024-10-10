package TUTORIAL_3;

import java.util.Scanner;

public class fibonacciUsingWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("ENTER THE LIMIT FOR YOUR FIBONACCI SERIES:");
		num=sc.nextInt();
		System.out.println("THE FIBONACCI SERIES IS AS FOLLOWS:");
		int first=0,sec=1,i=2;
		System.out.println(""+first);
		System.out.println(""+sec);
		while(num>i) {
			int next=first+sec;
			System.out.println(""+next);
			first=sec;
			sec=next;
			i++;
		}
		sc.close();
	}
}
