public class Dogg extends Animall 
{
  public void move()
	{
 		 System.out.println("Dogs can walk and run");
   	}
public void bark()
	{
		System.out.println("Dogs can bark");
	}
 public static void main(String args[]) 
 {
	Animall a = new Animall();
	Animall b = new Dogg();
	Dogg c = new Dogg();
  	a.move();
	b.move();
	c.bark();
 }
}