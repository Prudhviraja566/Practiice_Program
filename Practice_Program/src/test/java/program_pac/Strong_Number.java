package program_pac;

import java.util.Scanner;

public class Strong_Number 
{
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);	
	    System.out.println("Enter the value is :");
	    int num = s.nextInt();
	    int temp =num;
	    int sum = 0;
	    while(temp != 0)
	    {
	    	int rem = temp % 10;
	    	int fact = 1;
	    	for(int i = 1 ; i <= rem ; i++)
	    	{
	    		fact = fact * i;
	    	}
	    	sum = sum + fact;
	    	temp = temp / 10;
	    }
	    
	    String msg = num == sum  ? "It's Strong Number is :"   : " It's Not Strong Number :";
	    System.out.println(msg + num);
	}
}
