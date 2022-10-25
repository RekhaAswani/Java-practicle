public class CharacterConverter {

	public static void main(String[] args) {
		// initialize string
		String sample = "codippa";
		// initialize string buffer to hold updated string
		StringBuffer updatedString = new StringBuffer();
		// get array of characters in string
		char[] characters = sample.toCharArray();
		// iterate over characters
		for (int index = 0; index < characters.length; index++) {
			// get current character

			char c = characters[index];
			// check if position of this character is odd or even
			if (index % 2 == 0) {

				c = Character.toUpperCase(c);
			}
			// append character to string buffer
			updatedString.append(c);
		}

		System.out.println("Modified string is: " + updatedString.toString());
	}
}