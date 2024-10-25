package lab24;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int num,rem,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER:");
		num=sc.nextInt();
		sc.close();
        while(num>0) {
        	rem=num%10;
        	rev=(rev*10)+rem;
        	num=num/10;
        }
        System.out.println("REVERSED NUMBER IS "+rev);
	}

}
