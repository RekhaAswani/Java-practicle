import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class SingleKeyMultipleValuesUsingJava 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,List<String>> hashMap = new HashMap<String, List<String>>();
		
		List<String> listOne = new ArrayList<String>();
		
		listOne.add("Apple");
		listOne.add("Aeroplane");
		
		List<String> lisTwo = new ArrayList<String>();
		
		lisTwo.add("Banana");
		lisTwo.add("Bat");
		
		List<String> lisThree = new ArrayList<String>();
		
		lisThree.add("Cat");
		lisThree.add("Car");
		
		hashMap.put("A", listOne);
		hashMap.put("B", lisTwo);
		hashMap.put("C", lisThree);
		
		System.out.println("HashMap :" +hashMap +"\n");
		
		System.out.println("fetching keys and corresponding [multiple] Values \n");
		
		for( Map.Entry<String, List<String>> entry : hashMap.entrySet() )
		{
			String key = entry.getKey();
			List<String> values = entry.getValue();
			
			System.out.print("Key = " + key);
			System.out.println(" ,Values " + values );
		}
	}
}
