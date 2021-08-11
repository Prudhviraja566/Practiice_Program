package java_Lang_Package;

public class Object_Class 
{
    public static void main(String[] args) 
    {
	   Object_Class oc = new Object_Class();
	   System.out.println(oc);
	}
}

class DemoToString
{
	public static void main(String[] args) 
	{
	    DemoToString dt = new DemoToString();
	    System.out.println(dt);
	}
	public String toString()
	{
		return "Prudhvi raj";
	}
}


class Hashcode
{
	public static void main(String[] args) 
	{
	    Hashcode hc = new Hashcode();
	    int hascode = hc.hashCode();
	    System.out.println(hascode);
	}
	public int hashCode()
	{
		return 4567;
	}
}

class Equals
{
	public static void main(String[] args) 
	{
		int y;
		int x = y = 10;
	    Equals e = new Equals();
	    Equals e1 = new Equals();
	    System.out.println(e.equals(e1));
	    System.out.println(x == y);
	    
	    System.out.println(e);
	    System.out.println(e1);
	}
	public String toString()
	{
		return "Prudhvi Raj";
	}
}
