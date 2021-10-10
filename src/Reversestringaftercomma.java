public class Reversestringaftercomma 
{
	/**
	 * How to reverse a String after a comma and then print the 1st half of the String Java
	 */
public static void main(String[] args) 
  {
		// TODO Auto-generated method stub
		String word ="Rekha,Aswani";
		char ch1 = ' ';
        char ch2 = ' ';
        System.out.println(word.length());
		String result = "";
		for (int a = 0; a < word.length(); a++) 
			
////////////////////////////  reverse where there is a comma  /////////////////////////////////////////////////		
	{
		    if (word.charAt(a) == ',') 
		    {
		        for (int i = word.length() - 1; i > a; i--)
		        {
		            ch1 = word.charAt(i);
		            result = result+ch1;
		            System.out.println(a);
		        }
		        for (int j = 0; j < a; j++) 
		        {
		            ch2 = word.charAt(j);
		            result = result+ch2;
		        }
		    }
		}
		System.out.println(result);
	}
}