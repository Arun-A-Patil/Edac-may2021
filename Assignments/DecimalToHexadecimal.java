//Que. 20

import java.util.Scanner;
class DecimalToHexadecimal
{
 public static void main(String [] args)
 {
  int num1;
  Scanner sc= new Scanner(System.in);
  num1= sc.nextInt();
  System.out.println(Integer.toHexString(num1));
  }
}