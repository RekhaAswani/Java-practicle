import java.util.*;
public class HashMapDemo 
{	
 public static void main(String args[])
	{
	  HashMap <String,Integer>hm = new HashMap <String,Integer>();
	  hm.put("Amit", 100);
	  hm.put("Sachin", 200);
	  hm.put("Zubair", 300);
	  hm.put("Senthil", 400);
	  hm.put("Riyaz", 500);
	  hm.put("Riyaz", 600);		
	Set set = hm.entrySet(); //It returns the Set view containing all the keys and values.
	System.out.println(hm);
	System.out.println(hm.entrySet()); 
	//Get an iterator
	    Iterator i = set.iterator();
	//Display element
	    //Entry is the sub interface of Map.
        //Converting to Map.Entry so that we can get key and value separately  
while(i.hasNext())
	{
		Map.Entry me = (Map.Entry)i.next();
		System.out.println(me.getKey()+ ";");
	    System.out.println("AMp entries" +me.getValue());
	}
	  hm.put("Senthil", 700);
      System.out.println( "keys are" +hm.keySet());
	  System.out.println("Entries are" +hm.entrySet());
	  System.out.println("Output is" +hm.get("Senthil"));
	  System.out.println("Sachin T new balance:" +hm.get("SachinT"));		
	}
}