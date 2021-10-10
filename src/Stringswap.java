public class Stringswap {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a= "Hello";
		String b= "World";
		
		System.out.println("Before swapping");
		System.out.println("The value of a is:" +a);
		System.out.println("The value of b is:" +b);
		
		//1.append a and b
		a=a+b; // now a is this HelloWorld
		//store initial string a in string b
		b = a.substring(0,a.length()-b.length()); 
		a = a.substring(b.length()); 
		System.out.println("the value of a and b after swapping");
         
		System.out.println("The value of a is:" +a);
		System.out.println("The value of b is:" +b);
	}

}
