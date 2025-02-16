package StringPrograms;

public class stringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("pankaj");
		String s2 = new String("PANKAJ");
		
		System.out.println("before S1 is --"+s1);
		System.out.println("before S2 is --"+s2);
		System.out.println("assign s2 to s1 -> "+(s1 = s2));
		System.out.println("S1 is --"+s1);
		System.out.println("S2 is --"+s2);
		
		
		String s11 = new String("abc");
		String s22 = new String("abc");
		System.out.println("compairing s11 and s22");
		System.out.println(s11 == s22);
		
	}

}
