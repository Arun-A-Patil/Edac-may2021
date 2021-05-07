//Que. 17

import java.util.Scanner;
public class SumOfBinaryNumbers
{
    public static void main (String [] args)
   { 
     int num1,num2;
	 Scanner input= new Scanner (System.in);
     String str1 = input.nextLine();//123
	 num1= Integer.parseInt(str1,2);
     String str2 = input.nextLine();//123
	 num2= Integer.parseInt(str2,2);
	 System.out.println(Integer.toBinaryString(num1+num2));
    }
}
