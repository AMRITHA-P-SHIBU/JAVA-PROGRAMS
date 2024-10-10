package TUTORIAL_7;
import java.util.Scanner;
class Employee{
	String name;
	int age;
	long phone_no;
	float salary;
	void printEmployee() {
		System.out.println("NAME: "+name);
		System.out.println("AGE: "+age);
		System.out.println("PHONE NO: "+phone_no);
		System.out.println("SALARY: \n"+salary);
	}
}
class Manager extends Employee{
	String dept;
	void printDept() {
		System.out.println("DEPARTMENT: "+dept);
	}
	String task;
	void assignTaskToEmployee(){
		System.out.println("TASK ASSIGNED: "+task);
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Employee emp=new Employee();
		Manager manage=new Manager();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NO.OF EMPLOYEES:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("ENTER DETAILS OF EMPLOYEE "+i);
			System.out.println("ENTER NAME OF THE EMPLOYEE: ");
			sc.nextLine();
			emp.name=sc.nextLine();
			System.out.println("ENTER AGE OF THE EMPLOYEE: ");
			emp.age=sc.nextInt();
			System.out.println("ENTER PHONE NUMBER OF THE EMPLOYEE: ");
			emp.phone_no=sc.nextLong();
			sc.nextLine();
			System.out.println("ENTER SALARY OF THE EMPLOYEE: ");
			emp.salary=sc.nextFloat();
		}
		System.out.println("ENTER DETAILS OF MANAGER");
		System.out.println("ENTER NAME OF THE MANAGER: ");
		sc.nextLine();
		manage.name=sc.nextLine();
		System.out.println("ENTER AGE OF THE MANAGER: ");
		manage.age=sc.nextInt();
		System.out.println("ENTER PHONE NUMBER OF THE MANAGER: ");
		manage.phone_no=sc.nextLong();
		sc.nextLine();
		System.out.println("ENTER SALARY OF THE MANAGER: ");
		manage.salary=sc.nextFloat();
		System.out.println("ENTER DEPARTMENT OF THE MANAGER: ");
		sc.nextLine();
		manage.dept=sc.nextLine();
		System.out.println("EMPLOYEE DETAILS\n");
		for(int i=1;i<=n;i++) {
		System.out.println("DETAILS OF EMPLOYEE "+i);
		emp.printEmployee();
		}
		System.out.println("\nMANAGER DETAILS\n");
		manage.printEmployee();
		manage.printDept();
		System.out.println("NOW ASSIGN TASK TO EACH EMPLOYEE:");
		for(int i=1;i<=n;i++) {
			System.out.println("TO EMPLOYEE "+i);
			manage.task=sc.nextLine();
		}
		manage.assignTaskToEmployee();
	sc.close();
	}
}
