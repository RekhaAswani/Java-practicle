public class Double 
{
    /**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int data;
		try{  
		    data=7/0;  
		    System.out.println("data is " +data);
		   }
		catch(ArithmeticException e)
		   {
			System.out.println(e);}  
		   }
}