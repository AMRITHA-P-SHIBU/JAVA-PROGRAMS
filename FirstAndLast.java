package TUTORIAL_6;

import java.util.Scanner;

public class FirstAndLast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str,str1;
		System.out.println("Enter a string:");
		str=sc.nextLine();
		sc.close();
		str=str.toLowerCase();
		String ch1,ch2;
		ch1=str.substring(0,1);
		ch2=str.substring(str.length()-1);
		boolean res;
		res=ch1.equals(ch2);
		str1=str.substring(1,str.length()-1);
		if(res==true){
			System.out.println(str1);
			System.out.println("THE CHARACTERS ARE FOUND SAME AT BOTH FIRST AND LAST POSITION.");
			return;
		}
		else{
			System.out.println(str);
			System.out.println("THE CHARACTERS ARE NOT FOUND SAME AT THE FIRST AND LAST POSITION.");
			return;
		}
	}
}
