package program_pac;

import java.util.Scanner;

public class Amstrong_Number 
{
   public static void main(String[] args) 
   {
	  Scanner s = new Scanner(System.in); 
	  System.out.println("Enter the Value is :");
	  int num = s.nextInt();
	  int temp = num;
	  int temp1 = num;
	  int sum = 0;
	  int count = 0;
	  
	  while(temp != 0)
	  {
		  temp = temp / 10;
		  count++;
	  }
	
	  System.out.println(count);
	  
	  while(temp1 != 0)
	  {
		  int rem = temp1 % 10;
		  int prod = 1;
		  for(int i = 1; i <= count ; i++)
		  {
			  prod = prod * rem;
		  }
		  sum = prod + sum;
		  temp1 = temp1 /10;
	  }
	  String msg = num == sum ? "It's Amstrong Number : " : " It's Not Amstrong Number :";
	  System.out.println(msg + num);
   }
}
