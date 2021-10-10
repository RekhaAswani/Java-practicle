
public class StringManipulations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="The rains has started here and it will stop";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s'));
		

		System.out.println(str.indexOf('s',str.indexOf('s')+1));// 2nd occuarance of s
		
		System.out.println(str.indexOf('s',str.indexOf('s', str.indexOf('s')+1)+1));
		//check again 3rd occutrance of s
		
		System.out.println(str.indexOf('s',str.indexOf('s',str.indexOf('s', str.indexOf('s')+1)+1)+1));
		
	}

}
