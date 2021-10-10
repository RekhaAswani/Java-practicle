
public class Stringsplitfunctions {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is Mumbai";
		
		String temp[] =str.split(" ");
		
		//String temp[]=str.split(" ");
		
		for(int i=temp.length-1;i>=0;i--)
		{
			String newstr =temp[i];
			System.out.print(newstr+" ");
			
		}
		
	}

}
