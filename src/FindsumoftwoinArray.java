import java.util.Scanner;

public class FindsumoftwoinArray {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int n = keyboard.nextInt(); // this will take array length
		int[] nums = new int[n]; // n is this length of array
		// int nums[] = {2,7,11,15};

		for (int i = 0; i < n; i++) {
			nums[i] = keyboard.nextInt(); // this will take array element
		}
		int target = keyboard.nextInt(); // this will take target that is sum of
											// array elements

		keyboard.close();

		int[] indices = twoSum(nums, target);

		if (indices.length == 2) {
			System.out.println(indices[0] + " " + indices[1]);
		} else {
			System.out.println("No solution found!");
		}
	}

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}
}
/*
 * Input: nums = [3,2,4], target = 6 Output: [1,2]
 */

/*
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because
 * nums[0] + nums[1] == 9, we return [0, 1].
 */

