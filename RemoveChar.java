package TUTORIAL_6;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		System.out.println("Enter a character:");
		char character=sc.nextLine().charAt(0);
		String result=str.replace(character,'\0').replaceAll("\0","");
		System.out.println("The resulted string is:"+result);
		sc.close();
	}
}
