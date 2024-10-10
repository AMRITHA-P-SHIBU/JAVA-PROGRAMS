package TUTORIAL_6;
import java.util.Scanner;
public class CharAlphWordLineDigitSpace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String str=sc.nextLine();
		sc.close();
		int i,chars=0,word=1,line=1,alpha=0,digit=0,space=0;
		char c;
		for(i=0;i<str.length();i++) {
			c=str.charAt(i);
			if(c!='\0') {
				chars++;
			}
			if(c==' ') {
	        	word++;
	        }
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
				alpha++;
			}
			if(c>='0'&&c<='9') {
	        	digit++;
	        }
			if(c==' ') {
				space++;
			}
		}
			System.out.println("TOTAL NO.OF CHARACTERS IN THE STRING:"+chars);
			System.out.println("TOTAL NO.OF WORDS IN THE STRING:"+word);
			System.out.println("TOTAL NO.OF LINES IN THE STRING:"+line);
			System.out.println("TOTAL NO.OF ALPHABETS IN THE STRING:"+alpha);
			System.out.println("TOTAL NO.OF DIGITS IN THE STRING:"+digit);
			System.out.println("TOTAL NO.OF SPACES IN THE STRING:"+space);
	}
}