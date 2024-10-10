package lab24;
import java.util.Scanner;
class Employee{
	int da,hra;
	float basicpay;
	Employee(int da,int hra,float basicpay){
		this.da=da;
		this.hra=hra;
		this.basicpay=basicpay;
	}
	void Display() {
		System.out.println("...Employee...");
		}
	void calcSalary() {
		float gross;
		gross=(basicpay+(basicpay*da)/100+(basicpay*hra)/100);
		System.out.println("Gross salary of the EMPLOYEE is:"+gross);
	}
}
class Engineer extends Employee{
	Engineer(int da,int hra,float basicpay){
		super(da,hra,basicpay);
	}
	void Display() {
		super.Display();
		super.calcSalary();
		System.out.println("...Engineer...");
		}
	void calcSalary() {
		float gross;
		gross=(basicpay+(basicpay*da)/100+(basicpay*hra)/100);
		System.out.println("Gross salary of the ENGINEER is:"+(gross*2));
	}
}
public class InheritanceUsingSuper {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Da,Hra;
		float Basicpay;
		System.out.println("Enter Basic salary of the employee: ");
		Basicpay=sc.nextInt();
		System.out.println("Enter da% of the employee: ");
		Da=sc.nextInt();
		System.out.println("Enter hra% of the employee: ");
		Hra=sc.nextInt();
		sc.close();
		Engineer eng=new Engineer(Da,Hra,Basicpay);
		eng.Display();
		eng.calcSalary();
	}
}
