import java.util.*;
abstract class Dimension{
	double x,y,z;
	abstract double calArea();
}
class Rectangle extends Dimension{
	void setVal(double x, double y){
		this.x=x;
		this.y=y;
	}
	void getVal(){
		System.out.println(x+ " " + y);
	}
	double calArea(){
		return x*y;
	}
}
class Triangle extends Dimension{
	void setVal(double x,double y,double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	void getVal(){
	System.out.println(x+ " " + y + " " + z);
	}
	double calArea(){
		double s=((x+y+z)/2);
		return Math.sqrt(s*(s-x)*(s-y)*(s-z));
	}
}
public class Q2{
	public static void main(String args[]){
		Rectangle rec= new Rectangle();
		Triangle tri=new Triangle();
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Length Of Rectangle:");
		double rec1=sc.nextDouble();
        System.out.println("Enter The Width Of Rectangle:");
		double rec2=sc.nextDouble();
        System.out.println("Enter The Value Of 1st Side Of Triangle:");
		double tri1=sc.nextDouble();
        System.out.println("Enter The Value Of 2nd Side Of Triangle:");
		double tri2=sc.nextDouble();
        System.out.println("Enter The Value Of 3rd Side Of Triangle:");
		double tri3=sc.nextDouble();
		rec.setVal(rec1,rec2);
        System.out.println("Sides Of Rectangle:");
		rec.getVal();
		System.out.println("Area of Rectangle:" + rec.calArea());
		tri.setVal(tri1,tri2,tri3);
        System.out.println("Sides Of Triangle:");
		tri.getVal();
		System.out.println("Area of Triangle:" + tri.calArea());
}
}