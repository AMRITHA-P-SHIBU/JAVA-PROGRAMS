package lab24;
import java.util.Scanner;
public class MethodOverloading {
	public float area(float a,float b) {
		return (a*b)/2;
	}
	public int area(int a,int b) {
		return a*b;
	}
	public double  area(float a) {
		return 3.14*a*a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MethodOverloading obj=new MethodOverloading();
		System.out.println("Enter base of the triangle:");
	    float base=sc.nextInt();
		System.out.println("Enter height of the triangle:");
		float height=sc.nextFloat();
		float tri_ar=obj.area(base, height);
		System.out.println("Enter width of rectangle:");
		int rwidth=sc.nextInt();
		System.out.println("Enter height of rectangle:");
		int rheight=sc.nextInt();
		int rect_ar=obj.area(rwidth, rheight);
		System.out.println("Enter radius of circle:");
	    float radius=sc.nextInt();
	    double cir_ar=obj.area(radius);
		System.out.println("Area of the triangle with base "+base+" and "+"height "+height+" is:"+tri_ar);
		System.out.println("Area of rectangle with width "+rwidth+" and "+"height "+rheight+" is:"+rect_ar);
		System.out.println("Area of circle with radius "+radius+" is:"+cir_ar);
		sc.close();
	}
}