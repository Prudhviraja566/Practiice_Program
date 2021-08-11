package program_pac;

public class Non_primitiveCasting 
{
       public void wish()
       {
    	   System.out.println("All is well");
       }
       public void task()
       {
    	   System.out.println("No task on me");
       }
}

class Test extends Non_primitiveCasting
{
	public void print(String s)
	{
		System.out.println("print string message : " + s);
	}
	
	public void task()
	{
		System.out.println("My task is handle a job");
	}
}

class TestFather
{
	public static void main(String[] args) 
	{
	    Non_primitiveCasting np = new Non_primitiveCasting();
	    np.wish();
	    np.task();
	   
	    Test t = new Test();
	    t.wish();
	    t.task();
	    t.print("google");
	}
}
