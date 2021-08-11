package program_pac;

import java.util.Scanner;

public class Factoral 
{
   public static void main(String[] args) 
   {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the value is :");
	   int num = s.nextInt();
	   int fact = 1;
	   
	   for(int i =1 ; i <= num ; i++)
	   {
		   fact = fact * i ;  
	   }
	   System.out.println(fact);
   }
}  
