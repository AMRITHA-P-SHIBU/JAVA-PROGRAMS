package lab24;
import java.util.Scanner;
class Employee1{
	String name;
	int age;
	long phone_no;
	String address;
	float salary;
	void printEmployee() {
		System.out.println("NAME: "+name);
		System.out.println("AGE: "+age);
		System.out.println("PHONE NO: "+phone_no);
		System.out.println("ADDRESS: "+address);
		System.out.println("SALARY: "+salary);
	}
}
class Officer extends Employee1{
	String spcl;
	void printSpcl() {
		System.out.println("SPECIALISATION: "+spcl);
	}
}
class Manager extends Employee1{
	String dept;
	void printDept() {
		System.out.println("DEPARTMENT: "+dept);
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Officer office=new Officer();
		Manager manage=new Manager();
		System.out.println("OFFICER DETAILS");
		System.out.println("ENTER OFFICER NAME: ");
		office.name=sc.nextLine();
		System.out.println("ENTER OFFICER AGE: ");
		office.age=sc.nextInt();
		System.out.println("ENTER OFFICER PHONE NUMBER: ");
		office.phone_no=sc.nextLong();
		sc.nextLine();
		System.out.println("ENTER OFFICER ADDRESS: ");
		office.address=sc.nextLine();
		System.out.println("ENTER OFFICER SPECIALISATION: ");
		office.spcl=sc.nextLine();
		System.out.println("ENTER OFFICER SALARY: ");
		office.salary=sc.nextFloat();
		System.out.println("MANAGER DETAILS");
		System.out.println("ENTER MANAGER NAME: ");
		sc.nextLine();
		manage.name=sc.nextLine();
		System.out.println("ENTER MANAGER AGE: ");
		manage.age=sc.nextInt();
		System.out.println("ENTER MANAGER PHONE NUMBER: ");
		manage.phone_no=sc.nextLong();
		sc.nextLine();
		System.out.println("ENTER MANAGER ADDRESS: ");
		manage.address=sc.nextLine();
		System.out.println("ENTER MANAGER DEPARTMNET: ");
		manage.dept=sc.nextLine();
		System.out.println("ENTER MANAGER SALARY: ");
		manage.salary=sc.nextFloat();
		sc.close();
		System.out.println("\nOFFICER DETAILS: ");
		office.printEmployee();
		office.printSpcl();
		System.out.println("\nMANAGER DETAILS: ");
		manage.printEmployee();
		manage.printDept();
	}
}