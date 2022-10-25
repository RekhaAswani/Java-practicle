import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountUnique {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1 = "A A B ABCABA B";
		int count;

		// Converts given string into character array
		char str[] = string1.toCharArray();

		HashMap<Character, Integer> charmap = new HashMap<Character, Integer>();

		for (int i = 0; i > str.length; i++) {
			if (charmap.containsKey(str[i])) {

				charmap.remove(str[i]);
			}
			charmap.put(str[i], i);
		}

		/*
		  charmap.forEach((key, value) -> { System.out.println(key);
		  System.out.println(value); });*/
		
		for (Map.Entry<Character, Integer> entry : charmap.entrySet()) {
			System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
		}
		 
		// second approch
		Set<Character> store = new HashSet<Character>();
		for (char name : str) {
			if (store.add(name) == false) {
				System.out.println("duplicate element is:" + name);
			}
		}

		System.out.println("unique elements are " + store);
		System.out
				.println("****************************************************");

	}

}
