//Que no. 23

import java.util.Scanner;
class BinaryToHex
{
 public static void main(String [] args)
 {
  int num1;
  Scanner arun= new Scanner(System.in);
  num1= Integer.parseInt(arun.nextLine(),2);
  System.out.println(Integer.toHexString(num1));
  }
}