package lab24;
import java.io.*;
import java.util.*;
public class FileDemo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try {
		File f1 = new File("Sample.txt");
		if(f1.exists()) {

			System.out.println("Sample.txt exists");
		}		
		else{
			f1.createNewFile();
		}
		String s;
		System.out.println("Enter the String: ");
		s=sc.nextLine();
		FileWriter fw1 = new FileWriter("Sample.txt");
		fw1.write(s);
		System.out.println("Content written to Sample.txt");
		fw1.close();
		File f2=new File("new-sample.txt");
		if(f2.exists()) {
			System.out.println("new-sample.txt exists");
		}
		else {
			f2.createNewFile();
		}
		FileReader fr1=new FileReader("Sample.txt");
		System.out.println("-------Contents of Sample.txt-------:");
		int i;
		while((i=fr1.read())!=-1){
			System.out.print((char)i);
		}
		   FileWriter fw2 = new FileWriter("new-sample.txt");
		   FileReader fr2 = new FileReader("Sample.txt");
		         int c;
		         while ((c = fr2.read()) != -1) {
		            fw2.write(c);
		         }
		         fr2.close();
		         fw2.close();
		         System.out.println("\nContent copied from sample.txt to new-sample.txt");		
		         FileReader fr3=new FileReader("new-sample.txt");
		         System.out.println("-------Contents of new-sample.txt-------:");
		         int r;
		         while((r=fr3.read())!=-1) {
		        	 System.out.print((char)r);
		         }
		}catch(IOException e) {			
			System.out.println(e.getMessage());
			}
	}
}