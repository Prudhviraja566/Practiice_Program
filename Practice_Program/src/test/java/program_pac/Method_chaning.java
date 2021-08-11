package program_pac;

public class Method_chaning 
{
	public static void m1()
	{
		m2(40,50);
		System.out.println("m1 running");
	}
	public static void m2(int x, int y)
	{
		m3();
		System.out.println(x+y);
	}
	public static int m3()
	{
		m4(10,20);
		System.out.println("m3 running");
		return 10;
	}
	
	public static int m4(int x, int y)
	{
		System.out.println("m4 running");
		return x+y;
	}
	public static void main(String[] args) 
	{
		System.out.println("mms");
		m1();
		System.out.println("mme");
	}
}
