package inheritanceConcept;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		animal a1 = new animal();
		
		a1.animalEat();

		animal a2 = new babydog();
		
		a2.animalEat();
		
		
		babydog bd = new babydog();
		bd.animalEat();
		bd.dogEat();
		bd.babydogEat();
		bd.animalmethod();
//		System.out.println(bd.a);
		
	}

}
