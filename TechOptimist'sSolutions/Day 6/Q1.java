class shape{
	int x,y;
	void getXY(int x,int y){
		this.x=x;
		this.y=y;
	}
	void showXY(){
		System.out.println(x+ " " + y);
	}
	int calcarea(){
	return -1;
	}
}
class Rectangle extends shape{
	void storedata(int x,int y){
		int length=x;
		int breadth=y;
	}
	int calcarea(){ 
		return x*y; 
	}
}
public class Q1{
	public static void main(String args[]){
		Rectangle obj=new Rectangle();
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		obj.getXY(x,y);
		System.out.println("Given Length And Width:");
		obj.showXY();
		obj.storedata(x,y);
		System.out.println("Area is :" + obj.calcarea());
	}
}
		