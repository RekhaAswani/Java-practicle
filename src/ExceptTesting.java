public class ExceptTesting 
	{
	  public static void main(String args[]) 
	  {
		 int a[] = new int[2];
		 try  
		 {
			  System.out.println("Access element three:" +a[3]);
		 }
		catch(ArrayIndexOutOfBoundsException e)
		{
		//String e;
		System.out.println("Exception Thrown  : "  +e);
	} 
		 finally 
	 {
		//int[] a;
		a[0] = 6;
		System.out.println("First element value:"  + a[0]);
		System.out.println("Finally statefment is executed");
	  }
	}
}