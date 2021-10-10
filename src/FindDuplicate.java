import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find duplicate characters
		String str = "krishna sakinala";
		// String str = "java";
		char[] chars = str.toCharArray();
		// System.out.println(chars);
		Map<Character, Integer> charmap = new HashMap<Character, Integer>(); // creating//
																				// a
		// hash
		// map
		// logic--->character are inserted as key and count inserted as values
		for (Character ch : chars) {
			if (charmap.containsKey(ch)) {
				charmap.put(ch, charmap.get(ch) + 1);
			} else {
				charmap.put(ch, 1);
			}
		}
		// loop through only keys
		Set<Character> keys = charmap.keySet(); // returns set form of map,It
												// returns the Set view
												// containing all the keys.

		for (Character ch : keys) {
			if (charmap.get(ch) > 1) {
				System.out.println("character " + ch + " repeating "
						+ charmap.get(ch) + " times");
			}
		}
	}
}
