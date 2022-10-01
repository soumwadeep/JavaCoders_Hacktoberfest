class Point
{
	double x;
	double y;
	
	public Point()
	{
		x = 0.0;
		y = 0.0;
	}
	
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void displayPoint()
	{
		System.out.println("(" + x + "," + y + ")");
	}
	
	public void displayDist(Point obj1)
	{
		double res = Math.sqrt((Math.pow(obj1.x - this.x,2)) + Math.pow(obj1.y - this.y,2));
		System.out.println("Distance:" + res);
	}
}

class Q2
{
	public static void main(String[] args)
	{
		Point obj = new Point(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
		Point obj1 = new Point(Double.parseDouble(args[2]),Double.parseDouble(args[3]));
		
		obj.displayPoint();
		obj1.displayPoint();
		
		obj.displayDist(obj1);
	}
}
