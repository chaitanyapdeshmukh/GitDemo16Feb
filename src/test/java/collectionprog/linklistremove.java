package collectionprog;

import java.util.LinkedList;

public class linklistremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> arrl = new LinkedList<String>();
	        arrl.add("First");  //0
	        arrl.add("Second"); //1
	        arrl.add("Third");  //2
	        arrl.add("Random"); //3
	        arrl.add("four");
	    
	        System.out.println(arrl);
	        //System.out.println("Remov() method:"+arrl.remove());
	        //System.out.println("after remove the data is as -");
	        //System.out.println(arrl);       
	        
	        System.out.println("remove(index) method:"+arrl.remove(2));
	 	}
}
