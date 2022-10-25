import java.util.HashMap;
import java.util.Map;

public class FindSubArrayNegativenumbers {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void findSubArray(int[] arr, int sum) {
		if (arr.length == 0) {
			System.out.println("Array is empty");
			return;
		}
		int end, totalSumTillNow;
		end = 0;
		totalSumTillNow = 0;

		Map<Integer, Integer> map = new HashMap<>();

		while (end < arr.length) {
			totalSumTillNow = totalSumTillNow + arr[end];
			if (totalSumTillNow == sum) {
				System.out.println("start Index" + 0 + ", End Index:" + end);
				return;
			}

			int windowSum = totalSumTillNow - sum;

			if (map.containsKey(windowSum)) {
				int start = map.get(windowSum);
				System.out.println("start Index" + (start + 1) + ", End Index:"
						+ end);
				return;
			}
			map.put(totalSumTillNow, end++);
		}
	}

}
