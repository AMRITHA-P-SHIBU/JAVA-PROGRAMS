package TUTORIAL_7;
import java.util.Scanner;
class Employee1{
	String name;
	int age;
	long phone_no;
	void printEmployee1() {
		System.out.println("NAME: "+name);
		System.out.println("AGE: "+age);
		System.out.println("PHONE NO: "+phone_no);
	}
}
class FullTimeEmployee extends Employee1{
	float annualsalary;
	void printAnnualSalary() {
		System.out.println("ANNUAL SALARY: "+annualsalary);
	}
}
class PartTimeEmployee extends Employee1{
	float hoursalary;
	void printHourlySalary() {
		System.out.println("HOURLY SALARY: "+hoursalary);
	}
}
public class HierarchialInheritance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FullTimeEmployee fulltemp=new FullTimeEmployee();
		PartTimeEmployee partemp=new PartTimeEmployee();
		System.out.println("ENTER DETAILS OF FullTimeEmployee:");
		System.out.println("ENTER NAME: ");
		fulltemp.name=sc.nextLine();
		System.out.println("ENTER AGE: ");
		fulltemp.age=sc.nextInt();
		System.out.println("ENTER PHONE NUMBER: ");
		fulltemp.phone_no=sc.nextLong();
		sc.nextLine();
		System.out.println("ENTER ANNUAL SALARY:");
		fulltemp.annualsalary=sc.nextFloat();
		System.out.println("ENTER DETAILS OF PartTimeEmployee:");
		System.out.println("ENTER NAME: ");
		sc.nextLine();
		partemp.name=sc.nextLine();
		System.out.println("ENTER AGE: ");
		partemp.age=sc.nextInt();
		System.out.println("ENTER PHONE NUMBER: ");
		partemp.phone_no=sc.nextLong();
		sc.nextLine();
		System.out.println("ENTER HOURLY SALARY:");
		partemp.hoursalary=sc.nextFloat();
		System.out.println("FullTimeEmployee DETAILS");
		fulltemp.printEmployee1();
		fulltemp.printAnnualSalary();
		System.out.println("PartTimeEmployee DETAILS");
		partemp.printEmployee1();
		partemp.printHourlySalary();
	    sc.close();
	}
}
