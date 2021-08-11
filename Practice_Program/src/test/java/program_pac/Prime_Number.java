package program_pac;

import java.util.Scanner;

public class Prime_Number 
{
     public static void main(String[] args) 
     {
	   Scanner s = new Scanner(System.in);	
	   System.out.println("enter the Value is : ");
	   int num = s.nextInt();
	   int count = 0;
	   
	   if(num <= 0)
	   {
		   System.out.println("It's Not prime number :"  + num);
	   }
	   else
	   {
		   for(int i = 2 ; i < num ; i++)
		   {
		      if( num % i == 0 )
		      {
			     count++;
			     break;
		      }
		   }
	   }
	   String msg = count != 0 ? "It's Not Prime Number : ":"It's Prime Number :";
	   System.out.println(msg + num);
  	 }
}


class Prime_Number_1_To_100
{
	public static void main(String[] args) 
	{
	    int num = 2;
	    int check = 0;
	    
	    while(true)
	    {
	    	int count = 0;
	    	for(int i = 2; i < num ; i++)
	    	{
	    		if(num % i == 0)
	    		{
	    			count++;
	    			break;
	    		}
	    	}
	    	if(count == 0)
	    	{
	    		System.out.println(num);
	    		check++;
	    	}
	    	if(check == 100)
	    	{
	    		break;
	    	}
	    	num++;
	    }
	}
}