package TUTORIAL_3;

import java.util.Scanner;

public class factorialUsingWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("ENTER A NUMBER:");
		num=sc.nextInt();
		int i=1,fact=1;
		while(num>=i) {
			fact=fact*i;
			i++;
		}
		System.out.println("FACTORIAL OF "+num+" IS "+fact);
		sc.close();
		}
	}
