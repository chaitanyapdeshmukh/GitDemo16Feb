package ConstructorsDemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		Test t1 = new Test(10);
		
	}

	public Test()
	{
		this(10,20);
		System.out.println("no argument constructor");
	}
	public  Test(int i)
	{
		System.out.println("1 argument constructor");
	}
	public  Test(int i, int j)
	{
		System.out.println("2 argument constructor");
	}
}
