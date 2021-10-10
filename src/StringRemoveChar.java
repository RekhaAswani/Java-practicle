public class StringRemoveChar 
{
 public static void main(String args[])
	{
		String str="this is java";
		System.out.println(removeCharAt(str,3));
	    String str1="Hello hi hey World Hello";
		System.out.println(str1.replace('H', 'W'));
		System.out.println(str1.replaceFirst("He", "Wa"));
		System.out.println(str1.replaceAll("He", "W"));
		String strOrig="developers Hello6 Hello";
	    int intIndex=strOrig.indexOf("Hello6");
  if(intIndex==-1)
	    {
	    	System.out.println("Hello not found");	 
	    }
	    else
	    {
	    	System.out.println("Found Hello at index" +intIndex);
	    }
	}  //main close//
	
 public static String removeCharAt(String s,int pos)
	{
		 String s1=s.substring(0,pos);  //this
		 System.out.println(s1);
		 String s2=s.substring(pos+1);  //is java
		 System.out.println(s2);
		 System.out.println("Original string is "+s);
		 return (s1+s2);	 
	}
}
