package interfacelearn;

public class FourWheeler implements tyre, tube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FourWheeler fw = new FourWheeler();
		fw.tyreinterfacecolor();
		fw.tyreinterfacecounter();
		fw.selffour();
		
		tyre ty = new FourWheeler();
		ty.tyreinterfacecolor();
		
		
		tube t = new FourWheeler();
		t.tubeinterfacecolor();
		t.tubeinterfacetype();
		
		}


	public void tyreinterfacecounter() {
		
		System.out.println("this is four wheeler and have 4 tyre ");
	}


	public void tyreinterfacecolor() {
		// TODO Auto-generated method stub
		System.out.println("color of tyre is black");
	}

	public void tyreinterfaceengine() {
		// TODO Auto-generated method stub
		
	}
	
	public void selffour()
	{
		System.out.println("selft 4 wheel method");
	}

	public void tubeinterfacetype() {
		// TODO Auto-generated method stub
		System.out.println("this is tube of 4 wheel");
	}

	public void tubeinterfacecolor() {
		// TODO Auto-generated method stub
		System.out.println("this is tube color of 4 wheel");
	}


	public void check() {
		// TODO Auto-generated method stub
		
	}

	
	

}
