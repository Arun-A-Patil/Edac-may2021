public class PyramidPattern5
{
  public static void main(String[] args)
  {
     for(int i=9; i>=1; i--)
	 {
	   for(int j=1; j<=i; j++)
	   {
	     System.out.print(" ");
	   }
	   for (int k=i;k<=9; k++)
	   {
	    System.out.print(k);
	   }
	   for(int l=8; l>=i; l--)
	   {
	     System.out.print(l);
	   }
	   System.out.println();
	 }
  }
}
