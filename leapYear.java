package TUTORIAL_3;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("ENTER A YEAR:");
		year=sc.nextInt();
		if((year%4==0)&&(year%100!=0)) {
			System.out.println(year+" IS A LEAP YEAR.");
			}
		else {
			System.out.println(year+" IS NOT A LEAP YEAR.");
		}
		sc.close();
	}

}
