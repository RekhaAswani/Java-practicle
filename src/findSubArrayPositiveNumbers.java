public class findSubArrayPositiveNumbers {

	/*
	Input: nums = [2,7,11,15], target = 9
			Output: [0,1]
			Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
			
			Input: nums = [3,2,4], target = 6
            Output: [1,2]
             
            class Solution {
    public int[] twoSum(int[] nums, int target) {

        if (nums.length == 0) {
			System.out.println("Array is empty");
			return nums;
		}
int start, end, window_Sum;

		start = end = 0; // initially
		window_Sum = 0;

		while (end < nums.length) {
			window_Sum = window_Sum + nums[end];
		}
		if (window_Sum == target) {
			System.out.println("start Index " + start + "End Index " + end);
			return nums;
		}
		while (window_Sum > target && start <= end) {
			window_Sum = window_Sum - nums[start++];

			if (window_Sum == target) {
				System.out.println("start Index " + start + "End Index " + end);
				return nums;
			}
		}
		end++;

       return nums;
        
    }
}          
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,7,11,15};

		findSubArrayPositiveNumbers fr = new findSubArrayPositiveNumbers();
		fr.findSubArrayPositiveNumbers1(a, 9);
		// System.out.println("Sub array is" findSubArrayPositiveNumbers(a, 9);
	}

	public void findSubArrayPositiveNumbers1(int[] arr, int sum) {
		if (arr.length == 0) {
			System.out.println("Array is empty");
			return;
		}
		int start, end, window_Sum;

		start = end = 0; // initially
		window_Sum = 0;

		while (end < arr.length) {
			window_Sum = window_Sum + arr[end];
		}
		if (window_Sum == sum) {
			System.out.println("start Index " + start + "End Index " + end);
			return;
		}
		while (window_Sum > sum && start <= end) {
			window_Sum = window_Sum - arr[start++];

			if (window_Sum == sum) {
				System.out.println("start Index " + start + "End Index " + end);
				return;
			}
		}
		end++;
	}
	// System.out.println("There is no such element");
}
