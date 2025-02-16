package collectionprog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class againPractiseArrayList {
	
	public static void main (String args[]) {
	
	ArrayList<String> lst = new ArrayList<String>(); //parameterized to String
	lst.add("Apeksha");
	lst.add("10");
	lst.add("Vihaan");
	lst.add("4");
	
	System.out.println(lst);
	System.out.println(lst.contains(10));
	
	ListIterator<String> itr= lst.listIterator();
	
	while (itr.hasNext()) {
		try {
		String str = (String)itr.next();
		System.out.println(str);
		}
		catch (Exception e) {
			
			System.out.println("Its not string");
	
			
		}
		
	}
	
	int i = lst.size();
	System.out.println("size of list array is "+i);
	
	for(String strr : lst)
	{
		System.out.println(strr);
		
		
	}
	
	System.out.println("Print using index");
	
	for(i=0;i<lst.size();i++) {
		
		
		System.out.println(lst.get(i));
		
	}
	
	

	}

	}
	
	

