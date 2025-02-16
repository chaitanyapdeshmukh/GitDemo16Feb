package StringPrograms;

public class CompareSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
        String s2 = "abc";
        String s3= new String("abc");
        String s4= new String("abc");
        System.out.println("s1 == s2 ? "+(s1==s2)); //true
        System.out.println("s1 == s3 ? "+(s1==s3)); //false
        System.out.println("s1 equals s3 ? "+(s1.equals(s3))); //true
        System.out.println("s3 == s4 ? "+(s3==s4)); //false
        System.out.println("s3 equals s4 ? "+(s3.equals(s4)));  //true
        
        
        System.out.println("Note : When we use “==” operator, it checks for value of String as well as reference !!");
        System.out.println("When we use “equals” operator, it checks for value only !!");
    	
	}

}
