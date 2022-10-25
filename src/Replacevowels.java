public class Replacevowels {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = "Hello this is independence";

		replacevowels(s1);

		// TODO Auto-generated method stub
	}

	public static void replacevowels(String s) {
		char[] vowels = { 'á', 'e', 'i', 'o', 'u' };

		s = s.toLowerCase();

		for (char vow : vowels) {
			s = s.replace(vow, 'X');
		}
		System.out.println(s);
	}
}