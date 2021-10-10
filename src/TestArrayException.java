public class TestArrayException
{  
  public static void main(String args[])
{  
   int arr[]={50,60,70,80}; 
   System.out.println("Length is " +arr.length);  
   for(int i=0;i<=arr.length;i++)   // if we will use arr.length-1 exception will not occur.
  {  
      System.out.print(i +" element is ");
      System.out.println(arr[i]);  
  }  
}
}  