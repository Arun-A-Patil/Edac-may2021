import java.util.Scanner;
public class MultiplicationOfTwoNumbers
{
   public static void main (String[] args)
 {
	 int num1, num2;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter first number:  ");
	 num1 = sc.nextInt();
	 
	 System.out.println("Enter second number:  ");
	 num2 = sc.nextInt();
	 
	 sc.close();
	 
	 System.out.println(num1+"*"+num2+ "=: "+(num1*num2));
     
 }
}