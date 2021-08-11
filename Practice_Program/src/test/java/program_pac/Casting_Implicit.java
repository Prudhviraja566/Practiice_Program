package program_pac;

public class Casting_Implicit 
{
	public static void main(String[] args) 
	{
	    int a = 10;
	    long l = a;                // implicit casting small size to high size
	    
	    System.out.println(l);
	    
	    long l1 = 10;
	    int x = (int)l1;     		// explicit casting high size to small size   not recommend
	    
	    System.out.println(x);
	}
}
