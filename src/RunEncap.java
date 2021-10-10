public class RunEncap
{
  public static void main(String args[])
  {
		EncapTest e1 = new EncapTest();
		e1.setName("James");
		e1.setAge(20);
		e1.setid("12343ms");
	 //e1.lastName="mr senthil kumar";
		e1.setlastName("Gupta");
	System.out.println("Name:"  +e1.getName());
	System.out.println("age:"   +e1.getAge());
	System.out.println("id is:" +e1.getid());
	//System.out.println("last name is:" +e1.setlastName("Gupta"));
	System.out.println("last Name is" +e1.getlastName());
		
	EncapTest e2 = new EncapTest();
	e2.setName("amit");
	e2.setAge(26);
	e2.setid("1011");
	e2.setlastName("Aswani");
	//e2.lastName="mr sujit kumar";

	System.out.println("Name:" +e2.getName());
	System.out.println("Age:"  +e2.getAge());
	System.out.println("id is:" +e2.getid());
	//System.out.println("last Name is:" +e2.setlastName("Aswani"));
    System.out.println("last Name is:"  +e2.getlastName());
}
}	
