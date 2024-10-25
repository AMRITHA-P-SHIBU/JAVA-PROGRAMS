package lab24;

import java.util.Scanner;

class AddTable extends Thread{

	int num;

	AddTable(int num){ 

		this.num=num;

	}

	public void run() {

		synchronized(AddTable.class) {

			for(int i=1;i<=10;i++) {

				System.out.println(num+"+"+i+"="+(num+i));

			} 

		}
	}

}

public class ThreadSynchronizationDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the table you want to run by Thread1: ");

		int num1=sc.nextInt();

        AddTable n1=new AddTable(num1);

		System.out.println("Enter the table you want to run by Thread2: ");

		int num2=sc.nextInt();

		AddTable n2=new AddTable(num2);

		System.out.println("Enter the table you want to run by Thread3: ");

		int num3=sc.nextInt();

		AddTable n3=new AddTable(num3);

		n1.start();

		n2.start();

		n3.start();

	}

}
