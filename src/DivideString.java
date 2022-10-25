public class DivideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaaabbbbcccc";
		// Stores the length of the string
		System.out.println(" Actual String is " + str);
		int len = str.length();
		System.out.println("length of String is : " + len);
		// n determines the variable that divide the string in 'n' equal parts
		int n = 3;
		int temp = 0, chars = len / n  ;  //chars is 4
		// stores the array of string// array of string have length n
		String[] equalStr = new String[n];
		if (len % n != 0) {
			System.out.println("Sorry this string cannot be divided into " + n
					+ " equal parts.");
		}

		else {
			for (int i = 0; i < len; i = i + chars) {
				// Dividing string in n equal part using substring()
				String part = str.substring(i, i + chars);
				equalStr[temp] = part;
				temp++;
			}
			System.out.println(n + " equal parts of given string are ");
			for (int i = 0; i < equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}

	}

}
