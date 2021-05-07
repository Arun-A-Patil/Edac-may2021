//Que. 18

import java.util.Scanner;
class MultiplyOfBinaryNumbers
{
  public static void main (String [] args)
  {
   int num1,num2;
   Scanner sc = new Scanner(System.in);
   num1= Integer.parseInt(sc.nextLine(),2);
   num2= Integer.parseInt(sc.nextLine(),2);
   
   System.out.println(Integer.toBinaryString(num1*num2));
   }
   
}