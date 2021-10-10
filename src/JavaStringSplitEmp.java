public class JavaStringSplitEmp 
{
	/**
	 * @param args
	 */
 public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 String str = "jan-feb-march-april-may-jun-july";
		 String delimeter = "-";
		 String[] temp = str.split(delimeter);
		 System.out.println("Lenght "  +temp.length);
		 for(int i=0;i <temp.length;i++)
		    {
			 System.out.println(temp[i]);
			}
		 temp = str.split(delimeter,3);
		 for(int j=0;j<temp.length;j++)
		 {
			  System.out.println(temp[j]);
		 }
	}
}