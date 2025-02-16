package Exception;

public class MultipleTryCatchblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 try{  
			    int a[]=new int[5];  
			    a[5]=30/0;  
			   }  

		 	   catch(ArithmeticException e)
		 		{
		 		   System.out.println("task 1 is completed");
		 		}  
			   
		 	   catch(ArrayIndexOutOfBoundsException e)
		       {
		 		   System.out.println("task 2 completed");
		       }  
			   
		 		catch(Exception e)
		 		{
		 			System.out.println("common task completed");
		 		}  
			  
			   System.out.println("rest of the code 1...");  
			   System.out.println("rest of the code 2...");  
			   System.out.println("rest of the code 3...");  

	
	}  
	}


