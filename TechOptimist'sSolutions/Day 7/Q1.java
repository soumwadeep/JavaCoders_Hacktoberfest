import java.util.*;
interface Area{
	double calculate();
	double PI=3.14;
}
class Rectangle implements Area{
	double length,breadth;
	void getVal(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public double calculate(){
		return (length*breadth);
}
}
 class  Circle implements Area{
	double radius;
	void getVal(double radius){
		this.radius=radius;
	}
	public double calculate(){
		return (PI*radius*radius);
	}
}
public class Q1{
	public static void main(String args[]){
		Rectangle rec=new Rectangle();
		Scanner s=new Scanner(System.in);
        System.out.println("Enter The Length And Breadth Of Rectangle:");
        rec.getVal(s.nextDouble(),s.nextDouble());
		System.out.println("Area Of Rectangle:" + rec.calculate());

        Circle cir=new Circle();
        System.out.println("Enter The Radis Of Circle:");
        cir.getVal(s.nextDouble());
		System.out.println("Area Of Circle:" + cir.calculate());
	}
}