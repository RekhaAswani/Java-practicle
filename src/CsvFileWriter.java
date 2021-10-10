import java.io.*;
import java.util.*;
public class CsvFileWriter 
{
	  private static final String COMMA_DELIMITER = ",";
	  private static final String NEW_LINE_SEPARATOR = "\n";
	  private static final String FILE_HEADER = "id,firstName,lastName,gender,age";  
public static void writerCsvFile(String fileName)
	  {
		  Student student1 = new Student(1,"Amit","kumar","M",25);
		  Student student2 = new Student(2,"Smita","kumar","F",23);
		  Student student3 = new Student(3,"Ashish","Sharma","M",24);
		  Student student4 = new Student(4,"John","Taylor","M",20);
		  //create a new list of student objects
		  List<Student> studentsObj = new ArrayList<Student>();
		  studentsObj.add(student1);
		  studentsObj.add(student2);
		  studentsObj.add(student3);
		  studentsObj.add(student4);
		  FileWriter fileWriter = null;
		  try 
		  {
			  //File f1 = new File ("C://s1.csv");
			fileName = "C:\\Rekha\\s1.csv";
			fileWriter = new FileWriter(fileName);
			  //Write the CSV file header 
			fileWriter.append(FILE_HEADER.toString());
			fileWriter.append(NEW_LINE_SEPARATOR);
			String s1 = null;
			ListIterator<Student> it = studentsObj.listIterator();
			    while(it.hasNext())
			    {
			    	//s1 = it.next();
			    	System.out.println(it.next());
			    }
	for (Student student : studentsObj)
			{
				  fileWriter.append(String.valueOf(student.getId()));
				  fileWriter.append(COMMA_DELIMITER);
				  fileWriter.append(student.getFirstName());
				  fileWriter.append(COMMA_DELIMITER);
				  fileWriter.append(student.getLastName());
				  fileWriter.append(COMMA_DELIMITER);
				  fileWriter.append(student.getGender());
				  fileWriter.append(COMMA_DELIMITER);
				  fileWriter.append(String.valueOf(student.getAge()));
				  //fileWriter.append(String.valueof)
				  fileWriter.append(NEW_LINE_SEPARATOR);  
			}
	System.out.println("CSV file was created successfully !!!!");
		  }
		  catch(Exception e)
		  {
			  System.out.println("Error is CSVFileWriter !!!!");
			  e.printStackTrace();
		  }
		  finally 
		  {
			  try 
			  {
				  fileWriter.flush();
				  fileWriter.close();
			  }
			  catch(IOException e)
			  {
				  System.out.println("Error while flushing/closing fileWriter!!!!");
				  e.printStackTrace();
			}
		  }
	  }
	 public static void main(String[] args)
	 	{
		 String fileName = "student.csv";
		 System.out.println("Write CSV file:");
		 writerCsvFile(fileName);
	    }
	 	  }