package StringPrograms;

public class palindromProg {

	public static void main(String[] args) {
		
		palindromProg pc = new palindromProg();
		String strval = new String ("ababababa");
		
		boolean check = isPalindromeString(strval);
		
		System.out.println(check);
	}
	
    public static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }




}
