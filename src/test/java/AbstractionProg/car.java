package AbstractionProg;

public abstract class car {
	car(){
		System.out.println("Constructor of car");
	}
	
	abstract void speed();
	abstract void engine();
	
	void speedcheck()
	{
		System.out.println("we are checking speed, we are in abstract class");
	}
	
	void apacMethod()
	{
		System.out.println("we are checking speed, we are in abstract class");
	}
	
	void Architecht()
	{
		System.out.println("Added by Architect");
	}

}