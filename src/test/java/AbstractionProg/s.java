package AbstractionProg;	

//Creating interface that has 4 methods  
	interface A{		
	void a(); //bydefault, public and abstract  
	void b();
	void c();
	void d(); 	}
	
	//Creating abstract class that provides the implementation of one method of A interface  
	abstract class B implements A{
	   public void c() { System.out.println("I am C"); }
	}
//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
	class M extends B
	{
		public void a(){System.out.println("I am a");}
		public void b(){System.out.println("I am b");}
		public void d(){System.out.println("I am d");}
	//	public void c(){System.out.println("I am c when m extend b");}
	}
	
