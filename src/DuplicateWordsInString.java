import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class DuplicateWordsInString 
{
  public static void main(String[] args)
	{  
		String test = "This sentence contains two words, one and two";
		Set<String>duplicate = duplicateWords(test);
		System.out.println("input:" +test);
		System.out.println("output:" +duplicate);
   }	
/*Method to find duplicate words in a Sentence Or String */
	public static Set<String> duplicateWords(String input)
	{
		 if (input == null || input.isEmpty())
		 {
			 return Collections.emptySet(); 
		 }
		 Set<String> duplicates = new HashSet();
		 
		 String[] words = input.split("\\s+");  // it returns character of string
		 System.out.println(words.length);
		 Set<String> set = new HashSet<>();
		 for(String word:words)	 
		 {
			 if(!set.add(word))
			 {
				 duplicates.add(word);
			 }
		 }		 
		 return duplicates;
	}
}