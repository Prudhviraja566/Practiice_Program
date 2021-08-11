package program_pac;

import java.util.Scanner;

public class Addition_Of_Integer
{
     public static void main(String[] args) 
     {
	     Scanner s = new Scanner(System.in);
	     System.out.println("Enter the value is : ");
	     int num = s.nextInt();
	     int sum = 0;
	     
	     while(num != 0)
	     {
	    	 int rem = num % 10;
	    	 sum = sum + rem;
	    	 num = num / 10;
	     }
	     System.out.println(sum);
	 }
}

