package basic;

public class Bike {
	
	final int speedlimit = 90;
	
	public final void run() {
		System.out.println("run method of bike");
		speedlimit =400;
	}

	public static void main(String[] args) {
		Bike bk = new Bike();
		bk.run();
		
	}

}
