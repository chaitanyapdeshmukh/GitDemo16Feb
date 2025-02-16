package staticlearn;

public class Test {
//	Test t1= new Test();
	int i;
	static int j;
	static Test t2 = new Test();
	
	
	public static void main(String[] args) 
	{
		
		Test t1= new Test();
		
		t1.i=10;
		
		// i=10;// Error :- static function cannot access non static data
		t2 = new Test();
	
		j=10;
		t2.j=20;
	System.out.println(	t2.i=30);
}}
