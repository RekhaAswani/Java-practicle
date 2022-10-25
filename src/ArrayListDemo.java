import java.util.*;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial size of al:" + al.size());
		// add element to the array list
		al.add("C");
		al.add("F");
		al.add("A");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add("F");
		al.add("E");
		System.out.println("Contents of al:" + al);
		System.out.println("Size of al after additing elements" + al.size());
		// Remove elements from the array list
		al.remove("C");
		al.remove(2);
		System.out.println("Size of al after deletions:" + al.size());
		System.out.println("Contents of al:" + al);
		// /////// Hash set ///////////////////

		HashSet hs = new HashSet();
		hs.add("C");
		hs.add("F");
		hs.add("A");
		hs.add("B");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		hs.add("E");
		System.out.println("content of hash set" + hs);
		ListIterator it = al.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Object[] obj = al.toArray(); // converted object in to array
		Arrays.sort(obj); // will sort elements

		System.out.println("Size " + obj.length);
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}
}