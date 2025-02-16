package interfacelearn;
public class twoWheeler implements tyre  {
	
	public static void main(String[] args) {
		
		twoWheeler tw = new twoWheeler();
		tw.tyreinterfacecolor();
		tw.tyreinterfacecounter();
		tw.tyreinterfaceengine();
		tw.selftwo();
	}
	public void tyreinterfacecounter() {
			System.out.println("this is 2 wheeler and have 2 tyre ");
	}

	public void tyreinterfacecolor() {
			System.out.println("color of tyre is blue");
	}

	public void tyreinterfaceengine() {
		System.out.println("engine of tyre is good");
	}
	
	public void selftwo()	{
		System.out.println("selft 2 wheel method");
	}
	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}
}
