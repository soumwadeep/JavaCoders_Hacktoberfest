class Clock 
{
	int hour;
	int minute;
	public Clock()
	{
		this.hour = 0;
		this.minute = 0;
	}
	public Clock(int hour, int minute)
	{
		this.hour = hour;
		this.minute = minute;
	}
	public void displayClock()
	{
		if(this.minute == 120 || this.minute == 60)
		{
			this.hour += this.minute/60;
			this.minute = 0;
			System.out.println(this.hour + ":" + this.minute);
			return;
		}
		if(this.minute > 60)
		{
			this.hour += 1;
			this.minute = this.minute - 60;
			System.out.println(this.hour + ":" + this.minute);
			return;
		}
		System.out.println(this.hour + ":" + this.minute);
	}
	public void addClock(Clock obj1)
	{
		this.hour += obj1.hour;
		this.minute += obj1.minute;
	}
}
public class Q1
{	
	public static void main(String[] args)
	{
		Clock obj = new Clock(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		Clock obj1 = new Clock(Integer.parseInt(args[2]),Integer.parseInt(args[3]));
		
		obj.displayClock();
		obj1.displayClock();
		obj.addClock(obj1);
		System.out.println("---------------------------------");
		obj.displayClock();
	}
}
