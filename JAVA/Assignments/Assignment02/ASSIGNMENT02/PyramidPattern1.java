public class PyramidPattern1
{
    public static void main(String[] args)
    {
		
      for(int i=1;i<=9;i++)
	  {
	   for(int j=9;j>=1;j--)
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