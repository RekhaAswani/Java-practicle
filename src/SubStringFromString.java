public class SubStringFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Bangalore";

		System.out.println(str.indexOf('l'));

		int i = str.indexOf('l');

		int j = str.indexOf('r');

		String newstr = "";
		for (int k = i; k <= j; k++) {
			newstr += str.charAt(k);
		}
		System.out.println("sub String is :" + newstr);
	}

}
