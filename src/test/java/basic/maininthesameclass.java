package basic;

public class maininthesameclass {
	int id;
	String name;
	
	
	public void initializeThoughMethod() {
		this.id= 6589745;
		this.name="Initialize thorugh method";
	}
	
	public void initializeThroughMehtod(int i, String name) {
		this.id = i;
		this.name=name;
		
	}
	
	public void displayInformation() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		maininthesameclass m1 = new maininthesameclass();
		System.out.println(m1.id);
		System.out.println(m1.name); 
		
		//Initializing object through reference variable
		m1.id = 1234;
		m1.name = "intialized through reference variable";
		System.out.println(m1.id+"  "+m1.name);
		
		//initializing through method
		m1.initializeThoughMethod();
		m1.displayInformation();
		
		
	}

}
