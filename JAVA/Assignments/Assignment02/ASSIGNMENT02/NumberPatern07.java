import java.util.Scanner;

public class NumberPatern07
{
   public static void main(String[] args)
   {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the no of rows :");
   int noOfrows = sc.nextInt();
   int count=1;
   System.out.println("Here is your pyramid :");
     for(int i=noOfrows;i>=1;i--)
     {
       for(int j=1;j<=i;j++)
	   {
	   System.out.print(" ");
	   }
	   for(int k =1; k<=count;k++)
	   {
	   System.out.print(k+" ");
	   }
	   count++;
	   System.out.println();
     }
     
   }

}
