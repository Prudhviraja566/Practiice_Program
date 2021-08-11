package program_pac;

import java.util.Scanner;

public class Pallindrom 
{
    public static void main(String[] args) 
    {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter te value is ");
	    int num = s.nextInt();
	    int temp = num;
	    int res = 0;
	   
	    while(temp != 0)
	    {
	    	int rem = temp % 10;
	    	 res = (res*10)+rem;
	    	 temp = temp /10;
	    }
	    if(num == res)
	    {
	    	System.out.println("It's pallindrom is : " + num);
	    }
	    else
	    {
	    	System.out.println("It's not Pallindrom is :" + num);
	    }   
	}
}
