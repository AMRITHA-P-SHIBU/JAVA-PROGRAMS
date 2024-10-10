package TUTORIAL_7;
import java.util.Scanner;
class vehicle{
	String model;
	int year;
	void printModelAndYear() {
		System.out.println("MODEL: "+model);
		System.out.println("YEAR: "+year);
	}
}
class car extends vehicle{
	int DoorNum;
	void printDoor() {
		System.out.println("NO.OF DOORS: "+DoorNum);
	}
}
class electricar extends vehicle{
	int BatteryCapacity;
	void printCapacity() {
		System.out.println("BATTERY CAPACITY: "+BatteryCapacity);
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		vehicle v=new vehicle();
		car c=new car();
		electricar e=new electricar();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER MODEL: ");
		v.model=sc.nextLine();
		System.out.println("ENTER YEAR: ");
		v.year=sc.nextInt();
		System.out.println("ENTER NO.OF DOORS OF THE VEHICLE: ");
		c.DoorNum=sc.nextInt();
		System.out.println("ENTER THE BATTERY CAPACITY OF THE VEHICLE: ");
		e.BatteryCapacity=sc.nextInt();
		v.printModelAndYear();
		c.printDoor();
		e.printCapacity();
		sc.close();
	}
}
