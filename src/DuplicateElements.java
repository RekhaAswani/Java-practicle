import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = { "Java", "JavaScript", "Ruby", "C", "Python", "Java" };

		// 1.compate each element
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("duplicate element is:: " + names[i]);
				}
			}
		}
		System.out
				.println("****************************************************************");
		// 2.using Hashset
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("duplicate element is:" + name);
			}
		}

		System.out.println("uniqu elements are " + store);
		System.out
				.println("****************************************************");

		// /////3.using HashMap
		// 3//////////////////////////////////////////////////////////////
		/**
		 * using HashMap
		 */
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String name : names) { // names is an array of list
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);

			} else {
				storeMap.put(name, ++count);
			}
		}
		// /////////////get the values from this hash map
		// /////////////////////////////////////////////////
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("duplicate element is::" + entry.getKey()
						+ " " + entry.getValue());

			} else {
				System.out.println("It is not a duplicate element and count is ::" + entry.getKey()
						+ " " + entry.getValue());
			}
		}
	}

}
