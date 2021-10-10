import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Findoccurance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String str = "krishna sakinala";
		
		char[] chars = str.toCharArray();
		
		//System.out.println(chars);
		
		Map<Character,Integer>charmap = new HashMap<Character, Integer>();
    
		// logic--->character aare inserted as key and count inserted as values
		
		for (Character ch: chars)
		{
			if (charmap.containsKey(ch))
			{
				charmap.put(ch, charmap.get(ch)+1);
			}
			else 
			{
				charmap.put(ch,1);
			}
		}
		// loop through only keys
		
		Set<Character>keys =charmap.keySet();
		
		for(Character ch: keys)
		{
			
				System.out.println("character "+ ch + " repeating " +charmap.get(ch)+ "times");
			
		}
		

	}

}
