package collectionprog;

import java.util.ArrayList;
import java.util.ListIterator;

public class arrayList19Dec2024 {

	public static void main(String[] args) {
		
	ArrayList<String> lst = new ArrayList<String>();
	lst.add("Apeksha");
	lst.add("Vihaan");
	lst.add("Deshmukh");
	
	ListIterator <String> itr = lst.listIterator();
	
	while (itr.hasNext()) {
		
		System.out.println(itr.next());
	}
	
	
	for(String it : lst) {
		System.out.println(it);		
	}
	
	lst.add(1,"Appu");
	
	for (String it: lst) {
		System.out.println(it);
	}
	
	System.out.println(lst.size());
	System.out.println(lst);
	System.out.println(lst.isEmpty());
		lst.clear();
	System.out.println(lst.isEmpty());	

	}

}
