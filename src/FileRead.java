import java.io.*;
public class FileRead 
{
   public static void main(String[] args)
 {	
	File file = new File("hello.txt");
	file.getAbsolutePath();
	System.out.println("abs path :" +file.getAbsolutePath());
	try 
	{
		 if(file.createNewFile())
	{
	 System.out.print("file created successfully");	
     FileWriter  writer = new FileWriter(file);
     writer.write("This is an example");
     writer.close();
     FileReader fr = new FileReader(file);
     char []a = new char[50];
     fr.read(a);
     for(char c :a)  //enhanced loop
    	
    	System.out.print(c);
        fr.close();
        
			}
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}