public class CountSpaces {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "krishna sakinala Test";
		int count = 0;
		String[] arr = str.split("");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(" ")) {
				count++;

			}
		}
		System.out.println("space count is " + count);
	}
}
