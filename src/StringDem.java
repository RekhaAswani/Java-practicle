
public class StringDem {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char [] helloArray = {'h','e','l','l','o','.'};
       String helloString = new String (helloArray);
       System.out.println(helloString);
       
       String S ="Bangalore";
       
       String S1= S.substring(5,8);
    		   
       System.out.println("Substring is :" +S1);
		
	}

}
