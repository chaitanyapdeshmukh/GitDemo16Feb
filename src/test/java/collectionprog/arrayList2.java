package collectionprog;
import java.util.ArrayList;
import collectionprog.student;

public class arrayList2 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ArrayList al = new ArrayList();
			al.add(new student(100, "abhishek"));
			al.add(new student(101, "abhijeet"));
				
			System.out.println(al);		
			for(Object a:al)
			{
				if(a instanceof student)
				{
					student s = (student)a;
					
					System.out.println(((student) a).rollno);
					System.out.println(((student) a).name);
				}		
			
			}	

	}
		

}



