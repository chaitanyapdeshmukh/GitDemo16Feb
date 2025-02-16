package AbstractionProg;
public class BMW extends car {

	public static void main(String[] args) {
		
		car c = new BMW();
		c.engine();
		c.speed();
		c.speedcheck();
		
		//c.bmwself(); // not able to call this method		
		BMW b = new BMW();
		b.bmwself();
		b.speedcheck();
	}
	void bmwself()	{
		System.out.println("self method of bmw");
	}
		void speed() {		
		System.out.println("speed of bmw is 100kmperhour");
	}	
	void engine() {		
		System.out.println("engine of bmw is metalic");
	}
	@Override
	void speedcheck() {	
		super.speedcheck();  //super to access parent class method
		System.out.println("we r in speedcheck of bmw");
		System.out.println("Code uploaded in the us time zone");
		System.out.println("Code uploaded in the in APAC time zone");
		System.out.println("Code uploaded in the in APAC time zone 2");
		
	}
	
	void architecht() {	
		super.speedcheck();  //super to access parent class method
		System.out.println("we r in speedcheck of bmw");
		System.out.println("Code uploaded in the us time zone");
		System.out.println("Code uploaded in the in APAC time zone");
		System.out.println("Code uploaded in the in APAC time zone 2");
		
	}
	
}
