//Que no.12

import java.util.Scanner;
class AverageOfNumbers
{
 public static void main(String [] args)
 {
  double num1,num2,num3;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter First number: ");
  num1= sc.nextDouble();
  
  System.out.println("Enter Second number: ");
  num2= sc.nextDouble();
  
  System.out.println("Enter Third number: ");
  num3= sc.nextDouble();
  
  System.out.println("Average of numbers: "+((num1+num2+num3)/3));
  }
}