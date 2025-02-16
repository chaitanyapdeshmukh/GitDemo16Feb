package staticlearn;

public class staticvariable {
	
		static int count=0;//will get memory when instance is created  
		  
		 staticvariable()
		{  
			count++;  
			System.out.println(count);  
		}  
		  
		public static void main(String args[]){  
		  
			staticvariable c1=new staticvariable();  
			staticvariable c2=new staticvariable();  
			staticvariable c3=new staticvariable();  
		  
		 }  
		}  
