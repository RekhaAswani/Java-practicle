import java.io.*;
public class SearchFile {
	
	public static void main(String[] args) {
			try {
			BufferedReader bf = new BufferedReader(new FileReader("search.txt"));
		//start a line count and declare a string to hold our current line
			int linecount = 0;
			String line;
			// let the user know what we are searching for
			System.out.println("Searching for" +args[0]+ "in file" );
			while ((line = bf.readLine())!=null)
			{
				//increament the count and find the index of the word
				linecount++;
			 int indexfound = line.indexOf(args[0]);
			  
			  //if greater than -1, means we found the word
			  
			  if (indexfound> -1){
				  
				  System.out.println("word was found at position" +indexfound+"on line" + linecount);
				  System.out.println("line" +line);
			  }
			  else 
			System.out.println("Not found");
			  
			}
			bf.close();
			
		}
		catch(IOException e)
		
		{
			System.out.println("IO Error Occured:" +e.toString());
		
		}
			
	} 
				  
}	  
			  
			    
			  
			  
			
				
				
				
			
			



