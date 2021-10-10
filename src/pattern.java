public class pattern 
{
 public static void main(String args[])  
 {  
    int lines=10;     //Number of lines which you want to print
    int space=(lines*2)-2;       // space is 18 initially 
    System.out.println("number of  spaces" +space);
   
//////////////////////////////// for Upper half /////////////////////////////////////////////////////////////
  for(int i=1;i<=(lines/2);i++)   ///// i start from 1 here till 5
      {  
          boolean flagl=false;  
          for(int l=1;l<=i;l++)  
            {  
              if(!flagl)    
               {  
                 System.out.print("*");  
                 flagl=true;  
             }  
             else  
              {  
                    System.out.print(" ");  
                    System.out.print("*");  
              }  
           }  
           for(int l=1;l<=space;l++)    // space is 18 initially //14//10//6
            {  
                System.out.print(" ");     
            }  
                space=space-4;   // space is 18//14 ///10//6//2//-2
                boolean flagr=false;  
                for(int l=1;l<=i;l++)  
                {  
                if(!flagr)
              {  
                System.out.print("*");  
                flagr=true;  
              }  
                else  
                {  
                     System.out.print(" ");  
                     System.out.print("*");  
                }  
            }  
             System.out.println("");  
        } 
///////////////// for second half /////////////////////////////////////////////////////////
    
        space=space+4;             //space is 
         for(int i=(lines/2);i>=1;i--)    /// now it will be in decreasing mode
       {  
           boolean flagl=false;  
           for(int l=1;l<=i;l++)  
              {  
                if(!flagl){  
                System.out.print("*");  
                flagl=true;  
              }  
             else  
                {  
                   System.out.print(" ");  
                   System.out.print("*");  
                }  
             }  
             for(int l=1;l<=space;l++)  
            {  
                 System.out.print(" ");  
            }  
                space=space+4;  
                boolean flagr=false;  
                for(int l=1;l<=i;l++)  
                {  
                if(!flagr){  
                System.out.print("*");  
                flagr=true;  
                }  
                else  
                {  
                    System.out.print(" ");  
                    System.out.print("*");  
                }  
            }  
             System.out.print("\n");  
        }  
    }  
}   