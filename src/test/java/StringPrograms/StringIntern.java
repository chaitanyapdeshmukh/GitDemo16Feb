package StringPrograms;

public class StringIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = new String("abc");
		s2.intern();
		System.out.println(s1 ==s2);
		System.out.println("========================");
		String s11 = "abc";
		String s22 = new String("abc");
		s22=s22.intern();
		System.out.println(s1 ==s22);
		
		System.out.println("It’s a tricky question and output will be false. "
				+ "We know that "
				+ "intern() method will return the String object reference from the string pool,"
				+ "but since we didn’t assigned it back to s2, "
				+ "there is no change in s2 and hence both s1 and s2 are having different reference. "
				+ "when we change the code in line 3 to s22 = s22.intern(); then output will be true");
	}

}
