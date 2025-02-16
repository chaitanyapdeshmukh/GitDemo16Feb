package collectionprog;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class arraylistprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      List lst = new ArrayList();  
		      // A List contains instances of Object. Upcast ArrayList to List
		      
		      lst.add("alpha");            
		      // add() takes Object. String upcast to Object implicitly
		      
		      lst.add("beta");
		      lst.add("charlie");
		      
		      System.out.println(lst);     
		      // [alpha, beta, charlie]
		      System.out.println("---------");
		      // Get a "iterator" instance from List to iterate thru all the elements of the List
		      Iterator iter = lst.iterator();
		      while (iter.hasNext()) {      // any more element
		    	  System.out.println(iter.hasNext());
		         // Retrieve the next element, explicitly downcast from Object back to String
		         String str = (String)iter.next();
		         System.out.println(str);
		      }
		   }
		
	}


