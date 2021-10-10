public class StringDe 
{
  public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//String palidrome = "Dot saw I was Tod";
	  String palidrome = "My name is Rekha";
		palidrome.trim();
		System.out.println("palidrome " +palidrome);
	    int len = palidrome.length();
        System.out.println("String length is:" +len);
        String reverse ="";
        for(int i=palidrome.length()-1 ;i>=0 ;i--)
       {    
         reverse = reverse +palidrome.charAt(i);   
       }
	     System.out.println(reverse);
	}
}