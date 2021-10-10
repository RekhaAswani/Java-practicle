public class findSubArrayPositiveNumbers 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]={1,2,4,5,3};
		
		findSubArrayPositiveNumbers fr = new findSubArrayPositiveNumbers();
		 fr.findSubArrayPositiveNumbers1(a, 9);
		//System.out.println("Sub array is" findSubArrayPositiveNumbers(a, 9);
	}
	public void findSubArrayPositiveNumbers1(int[] arr, int sum)
	{
		if(arr.length==0)
		{
			System.out.println("Array is empty");
			return;
		}
  int start,end,window_Sum;
	
	start=end =0; // initially
	window_Sum=0;
	
	while(end<arr.length)
	{
		window_Sum= window_Sum+ arr[end];
	}
 if(window_Sum==sum)
 {
	 System.out.println("start Index " + start +"End Index " +end);
	 return;
 }
while(window_Sum>sum && start <=end)
 { window_Sum= window_Sum -arr[start++];
	
  if(window_Sum ==sum)
     {
	    System.out.println("start Index " + start +"End Index " +end);
	    return;
     }
 }
	end++;	 
 }
	// System.out.println("There is no such element");
}
  
