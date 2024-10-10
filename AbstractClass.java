package lab24;
import java.util.Scanner;
abstract class Shape{
	abstract void numberOfSides();
}
class Rectangle extends Shape{
	int side;
	Rectangle(int side){
		this.side=side;
	}
	void numberOfSides() {
		int sum=(side-2)*180;
		System.out.println("I am a Rectangle and i have "+side+" sides.");
		System.out.println("Sum of the angles: "+sum);
		}
}
class Triangle extends Shape{
	int side;
	Triangle(int side){
		this.side=side;
	}
	void numberOfSides() {
		int sum=(side-2)*180;
		System.out.println("I am a Triangle and i have "+side+" sides.");
		System.out.println("Sum of the angles: "+sum);
		}
}
class Hexagon extends Shape{
	int side;
	Hexagon(int side){
		this.side=side;
	}
	void numberOfSides() {
		int sum=(side-2)*180;
		System.out.println("I am a Hexagon and i have "+side+" sides.");
		System.out.println("Sum of the angles: "+sum);
		}
}
public class AbstractClass {
	public static void main(String[] args) {
		int side;
		Scanner sc=new Scanner(System.in);
		String choice;
		do{
			System.out.println("Enter the number of sides of the polygon: ");
		side=sc.nextInt();
		if(side==4) {
			Rectangle r=new Rectangle(4);
			r.numberOfSides();
		}
		else if(side==3) {
			Triangle t=new Triangle(3);
			t.numberOfSides();
		}
		else if(side==6) {
			Hexagon h=new Hexagon(6);
			h.numberOfSides();
		}
		else {
			System.out.println("SORRY THAT IS INVALID");
		}
		System.out.println("DO YOU WANT TO CONTINUE?(Y/N)");
		sc.nextLine();
		choice=sc.nextLine();
	}
		while(choice.toLowerCase().equals("y"));
		if(choice.toLowerCase().equals("n")) {
		System.out.println("EXITING...");
		}
		sc.close();
	}
}