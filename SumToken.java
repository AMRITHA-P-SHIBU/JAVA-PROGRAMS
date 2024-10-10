package lab24;
import java.util.*;
public class SumToken {
	public static void main(String args[]) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers with one space gap:");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		while (st.hasMoreTokens()) {
			String temp = st.nextToken();
			sum+=Integer.parseInt(temp);
			System.out.println(temp);
		}
		System.out.println("sum of the integers is: " + sum);
		sc.close();
	}
}