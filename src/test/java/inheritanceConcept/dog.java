package inheritanceConcept;

public class dog extends animal {

	public void dogEat()
	{
		System.out.println("dog eat");
	}
	
	public void animalEat()
	{
		System.out.println("Animal Eat from dog");
	}
	
	public void animalmethod()
	{
		System.out.println("in dog - animalmethod");
	}
}
