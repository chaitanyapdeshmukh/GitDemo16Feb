package ThreadingProgram;

public class testThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mythread m = new mythread();
		m.run();
		for (int i =0 ; i <= 19 ; i++)
		{System.out.println("this is parent thread in main");}
	}

}

class mythread extends Thread
{
	public void run()
	{
		for (int i =0 ; i <= 19 ; i++)
			{System.out.println("this is child thread");
			
			}
	}
}
