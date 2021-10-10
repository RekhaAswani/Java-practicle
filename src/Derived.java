
public abstract class Base{
	
	private int x;
	
	abstract void foo();
}
public class Derived extends Base{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived d = new Derived();
		d.bar();

	}

	void bar(){
		System.out.println("Drived::bar");
	}
}
