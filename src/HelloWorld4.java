public class HelloWorld4
{
  String userName;
  public static void main(String[] args)
  {
	  try
  {
    HelloWorld4 hw = new HelloWorld4();
    hw.userName = args[0];
    System.out.println("Hello " + hw.userName);
  }
  catch(ArrayIndexOutOfBoundsException e)
      {
	    System.out.println("Exception" +e.getStackTrace());
	  }
  }
  public void display(String age)
  {
    System.out.println("Hello " + userName);
  }
}