package inheritanceConcept;

public class CheckOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Childclass cl = new Childclass();
		cl.property();
		cl.decideshadi();
		
		Parentclass p1 = new Childclass();
		// cannot call method which are in child class
		p1.property();
		p1.decideshadi();
		
		
		
	}

}
