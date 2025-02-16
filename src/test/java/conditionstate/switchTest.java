package conditionstate;

public class switchTest {

	public static void main(String[] args) {
		int number1 = 1;

		switch(number1) {

		case 1:

			System.out.println("number is one.");
			break;

		 case 2:
			 System.out.println("number is two.");
			 break;

		 case 3:

			System.out.println("number is three.");

			//no break statement
			
		 case 4:
			 System.out.println("this is case 4");
			 
			 //no break statement

			default:

			System.out.println("number is greater than 3.");

			break;

			}


	}

}
