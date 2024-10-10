package lab24;
import java.util.Scanner;
public class FreqChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String str=sc.nextLine();
		int len=str.length();
		char ch;
		System.out.println("ENTER A CHARACTER TO CHECK THE FREQUENCY OF:");
		ch=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<len;i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(ch+" OCCURS "+count+" TIMES");
		sc.close();
	}
}
