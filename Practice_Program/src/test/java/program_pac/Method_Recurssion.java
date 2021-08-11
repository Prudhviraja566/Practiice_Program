package program_pac;

public class Method_Recurssion 
{
   int num = 1;
   public void printNum()
   {	   
	   if(num <= 100)
	   {
		 
		System.out.println(num++);
		   printNum();
	   }
   }
   public static void main(String[] args) 
   {
	  Method_Recurssion ms = new Method_Recurssion();
	  ms.printNum();
   }
}


class Factora_MethodRecurssion
{
	int fact = 1;
	public int  printFact(int num)
	{
		if(num >= 1)
		{
			fact = fact * num;
		    printFact(--num);
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		Factora_MethodRecurssion d = new Factora_MethodRecurssion();
	   int x = d.printFact(5);
	   System.out.println(x);
	}
}



class Prime_NumberRecussion
{
	int x = 2;
	int count = 0 ;
	public int primeNum(int num)
	{
		if(num <= 1)
		{
			System.out.println("It's Not Prime Number" + num);
		}
		else
		{
			if(num % x == 0)
			{
				count++;
			}
			else
			{
				if(x != num)
				{
					x++;
				}
				primeNum(num);
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int num = 5;
		Prime_NumberRecussion p = new Prime_NumberRecussion();
		int x = p.primeNum(num);
		String msg = x == 1 ? "It's not prime number " : "It's Prime Number ";
		System.out.println(msg + num );
	}
}