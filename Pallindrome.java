package lab24;
import java.util.Scanner;
public class Pallindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String str=sc.nextLine();
		sc.close();
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("REVERSE OF THE STRING IS "+rev);
		if(str.equals(rev)) {
			System.out.println(str+" IS PALINDROME");
		}
		else {
			System.out.println(str+" IS NOT PALINDROME ");
		}
	}
}


