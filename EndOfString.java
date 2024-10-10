package TUTORIAL_6;

import java.util.Scanner;

public class EndOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("ENTER A STRING:");
		str=sc.nextLine();
		sc.close();
		str=str.toLowerCase();
		String sub;
		sub=str.substring(0,2);
		String sub2=str.substring(str.length()-2);
		boolean found;
		found=sub.equals(sub2);
		if(found==true) {
			System.out.println("'"+sub+"' APPEARS AT THE END OF THE STRING.");
		}
		else {
			System.out.println("'"+sub+"' DON'T APPEARS AT THE END OF THE STRING.");
		}
	}

}
