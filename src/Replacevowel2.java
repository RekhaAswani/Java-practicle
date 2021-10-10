import java.util.Scanner;
public class Replacevowel2 
{
	/**
	 * @param args
	 */
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = scan.nextLine();
		char ch[] =st.toCharArray();
		
		for(int i=0;i<ch.length;i++)  //i+=2
		{	
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				if (i % 2 != 0) {	
					ch[i]='m';	
				}
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}
}