public class TestWrapper {
	public static void main(String args[]) {
		Integer x = 5;
		x = x + 10;
		System.out.println(x);
		Integer y = 5;
		double d = 10.56;
		System.out.println(y.toString());
		System.out.println(Integer.toString(12));

		int e = Integer.parseInt("9");

		System.out.println("e value " + e);
		//String a="5.2";
		double f = Double.parseDouble("15.2");

		
		// Double dObj = new Double(d);
		System.out.println("f value " + f);

	}
}