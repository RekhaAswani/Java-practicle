public class StringDemo 
 {
   public static void main(String[] args) 
      {
		// TODO Auto-generated method stub
		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		System.out.println("Lenght is:" +len);
		char[] tempCharArray = new char[len];
		char[] charArray = new char[len];
		
	 for(int i=0 ; i < len; i++)
	  { 		
			tempCharArray[i] = palindrome.charAt(i);
	  }
	 for (int j =0 ; j<len; j++)
	 {
       charArray[j]= tempCharArray[len -1-j];
     }
		String reversePalindrome = new String(charArray);
		System.out.println(reversePalindrome);
	}
}