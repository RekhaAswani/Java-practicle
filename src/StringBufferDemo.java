import java.lang.*;

public class StringBufferDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("java");
		System.out.println(sb);
		sb.insert(1, "java");
		System.out.println(sb);
		sb.replace(1, 3, "Tes");
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);

	}
}
