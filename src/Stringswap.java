public class Stringswap {

	public static void main(String[] args) {
		String a = "Hello"; // 5
		String b = "World"; // 5

		System.out.println("Before swapping");
		System.out.println("The value of a is:" + a);
		System.out.println("The value of b is:" + b);

		// 1.append a and b
		a = a + b; // now a is this HelloWorld //10
		// store initial string a in string b
		b = a.substring(0, a.length() - b.length()); // hello
		a = a.substring(b.length()); // world
		System.out.println("the value of a and b after swapping");

		System.out.println("The value of a is:" + a);
		System.out.println("The value of b is:" + b);
	}

}
