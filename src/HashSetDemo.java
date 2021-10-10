import java.util.*;
public class HashSetDemo 
{
 public static void main(String args[]) 
    {
   //create a hash set
      HashSet hs = new HashSet();
      hs.add("B");
      hs.add("A");
      hs.add("D");
      hs.add("E");
      hs.add("C");
      hs.add("F");
      hs.add("1");
      hs.remove("D");
  HashSet hs1 = new HashSet();
      hs1.add("AA");
      hs1.add("BB");
      hs1.add("CC");
      hs1.addAll(hs);
      hs1.size();
     Object[] h = hs.toArray();
     System.out.println(h);
         for(int i= 0;i<h.length;i++ )
            {
                System.out.println (h[i]);
            }
            System.out.println(hs1);
      
      Iterator it = hs.iterator();
      while (it.hasNext())
         {
    	   System.out.println(it.next());
         }
  }
}
      
      