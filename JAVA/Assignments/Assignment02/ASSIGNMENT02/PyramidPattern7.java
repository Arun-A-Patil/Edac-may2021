public class PyramidPattern7
{
    public static void main(String[] args)
    {
		
      for(int i=9;i>=1;i--)
	  {
		  for(int k=9; k<=i;k++)
		  {
			  System.out.print(" ");
		  }
			  
	   for(int j=1;j<=9;j++)
	   {
	     if(j>i)
		 {
		 System.out.print(" ");
		 }
		 else
		 System.out.print(" "+i);
	 
		 
	   }
	   System.out.println();
	  }
    }
}