package program_pac;

import java.util.Scanner;

public class Pattern1 
{
     public static void main(String[] args) {
		int row = 5;
		int count = 5;
		
		for (int i = 1 ; i <= row ; i++) 
		{
		   for (int j = 1; j <= count ; j++) 
		   {
			    System.out.print(i + " ");
		   }	
		   		System.out.println();
		}
	}
}


class Pattern2 
{
	public static void main(String[] args) {
		
		int row = 5;
		
		for (int i = 1; i <= row ; i++) 
		{
		   for (int j = 1; j <= row; j++) 
		   {
			  System.out.print(j + " ") ;
		   }	
		      System.out.println(); 
		}
	}
}


class Pattern3
{
	public static void main(String[] args) 
	{
	    int row = 5;
		char ch = 'A';
	    for (int i = 1 ; i <= row; i++) 
	    {
		  for(int j = 1 ; j <= row ;  j++)
		  {
			  System.out.print(ch);
			 
		  }
		  System.out.println();
		  ch++;
		}
	}
}


class Pattern4
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
	    System.out.println(" enter te value in row :");
	    int row = s.nextInt();
	    
	    for(int i = 1 ; i <= row ; i++)
	    {
	    	char ch = 'A';
	    	for(int j = 1 ; j <= row ; j++ )
	    	{
	    	  System.out.print(ch +  " ");
	    	  ch++;
	    	}
	    	System.out.println();
	    }
	}
}



class Pattern5
{
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the value is :");
	    int row = s.nextInt();
	    System.out.println("enter the column is ");
	    int col = s.nextInt();
	    
	    for(int i = 1 ; i <= row ; i++)
	    {
	    	for(int j=1 ; j <= col ; j++)
	    	{
	    		System.out.print(j + " ");
	    	}
	    	col++;
	    	System.out.println();
	    }
	}
}

class Pattern6
{
	public static void main(String[] args) 
	{
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter te value is : ");
	   int row = s.nextInt();
	   System.out.println("Enter the value is space :");
	   int space = s.nextInt();
	   System.out.println("Enter the value is col :");
	   int col = s.nextInt();
	   
	   for(int i = 1 ; i <= row ; i++ )
	   {
		   for(int j = 1 ; j <= space ; j++)
		   {
			   System.out.print(" " + " ");
		   }
		   
		   for(int k = 1 ; k <= col ; k++)
		   {
			   System.out.print(k + " ");
		   }
		   col++;
		   space--;
		   System.out.println();
	   }
	}
}



class Pattern7
{
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the value is : ");
	    int row = s.nextInt();
	    System.out.println("Enter the value is count :");
	    int count = s.nextInt();
	    int num =  0;
	    
	    for(int i = 1 ; i <= row ; i++)
	    {
	    	num =  num + i;
	    	int x = num;
	    	
	    	for(int j = 1 ;j <= count ; j++)
	    	{
	    		System.out.print(x-- + " ");
	    	}
	    	count++;
	    	System.out.println();
	    }
	}
}

class Pattern8
{
	public static void main(String[] args) 
	{
	    int row = 4;
	    int space = 3;
	    int col = 1;
	    
	    for(int i = 1 ;  i <= row ; i++)
	    {
	    	int x = i-1;
	    	for(int j = 1 ; j <= space ; j++)
	    	{
	    		System.out.print(" " + " ");
	    	}
	    	for(int k = 1 ; k <= col ; k++)
	    	{
	    		int z = x--;
	    		if(z > 0)
	    		{
	    			System.out.print(z + " ");
	    		}
	    		else
	    		{
	    			System.out.print(-z + " ");
	    		}
	    	}
	    	space--;
	    	col+=2;
	    	System.out.println();
	    }
	}
}