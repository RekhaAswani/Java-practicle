 public class FactDemo 
 {
	static int Factorial(int n)
	{
		int fact=1;
	for (int i=1;i<=n;i++)
	{
		fact =fact*i;
	}
	return fact;
    }
public static void main(String args[])
{
  {
	int fact;
	fact= Factorial(7);
	System.out.println("factorial is " +fact);
  }
}
}