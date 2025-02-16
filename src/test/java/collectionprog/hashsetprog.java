package collectionprog;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        Iterator<String> itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
	  }
	}
