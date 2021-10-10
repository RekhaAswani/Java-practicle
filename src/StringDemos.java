
public class StringDemos {
	  
	public static void main(String args[]){
		
		char[] helloArray = {'h','e','l','l','o','.'};
		String helloString = new String(helloArray);
		System.out.println(helloString);
		
		String s1= new String("durga");
		String s2 = new String("durga");
		char ch[]={'d','u','r','g','a'};
		
		String s3=new String(ch); // prints hello
		String s4="durga";  // both refers to same instance
		String s5="durga";  // refers to same instance
		
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1==s3); //false
		System.out.println(s1==s4);//false
		System.out.println(s1.equals(s4)); //true
		System.out.println(s4.equals(s5)); //true
		System.out.println(s4==s5); //true (because both refer to same instance and new keyword is not used here)
		System.out.println(s1==s5); // false s1 refers to the new instance created in pool
		
		
		
				
	}

}
