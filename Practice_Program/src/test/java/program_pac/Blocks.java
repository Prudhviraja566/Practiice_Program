package program_pac;

public class Blocks 
{
	{
		System.out.println("Non static block");
	}
	 static
	{
		System.out.println("static block");
	}
	
	public static void main(String[] args) 
	{
		Blocks b =new Blocks();
		Blocks b1 = new Blocks();	
	}
}

class Demo
{
	static int y = 5 ;
	int x = 10; 
	{
		System.out.println(4);
	}
	static 
	{
		System.out.println(2);
	}
}
class Demo1
{
	{
		System.out.println(1);
	}
	static 
	{
		System.out.println(3);
	}
	
	public static void main(String[] args) 
	{
	   System.out.println("mms");
	   Demo d = new Demo();
	   System.out.println(d.x);
	   Demo1 d1 = new Demo1();
	   System.out.println("mme");
	}
}