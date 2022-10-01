class Complex
{
	int realNum;
	int imgNum;
	
	Complex()
	{
		realNum = 0;
		imgNum= 0;
	}

	Complex(int realNum, int imgNum)
	{
		this.realNum = realNum;
		this.imgNum = imgNum;
	}

	void setReal(int realNum)
	{
		this.realNum = realNum;
	}
	void setImaginary(int imgNum)
	{
		this.imgNum = imgNum;
	}
	int getReal()
	{
		return realNum;
	}
	int getImaginary()
	{
		return imgNum;
	}
	Complex add(Complex obj1)
	{
		Complex res = new Complex();
		int realNum = this.realNum + obj1.realNum;
		int imgNum = this.imgNum + obj1.imgNum;
		res.setReal(realNum);
		res.setImaginary(imgNum);
		//System.out.println("Addition of two Complex nos. = " + realNum + "+" + imgNum + "i");
	}
	Complex subtract(Complex obj1)
	{
		Complex res = new Complex();
		int realNum = this.realNum - obj1.realNum;
		int imgNum = this.imgNum - obj1.imgNum;
		res.setReal(realNum);
		res.setImaginary(imgNum);
		//System.out.println("Subtraction of two Complex nos. = " + realNum + "-" + imgNum + "i");
	}
}

class Q3
{
	public static void main(String[] args)
	{
		Complex obj = new Complex(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		Complex obj1 = new Complex(Integer.parseInt(args[2]),Integer.parseInt(args[3]));
		Complex obj2 = new Complex();

		System.out.println("First Complex no. =" + obj.getReal() + "+" + obj.getImaginary() + "i");
		System.out.println("second Complex no. =" + obj1.getReal() + "+" + obj1.getImaginary() + "i");

		obj2 = obj.add(obj1);
		System.out.println("Addition of two Complex nos.=" + obj2.realNum + "+" + obj2.imgNum + "i");

		obj2 = obj.add(obj1);
		System.out.println("Subtraction of two Complex nos.=" + obj2.realNum + "+" + obj2.imgNum + "i");
	}
}
