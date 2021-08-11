package interview_Quections_String;

public class Reverse_String 
{
	public static void main(String[] args) 
	{
	    String str ="prudhvi raj";
	    
	    String rev = "";
	    
	    for(int i = str.length()-1 ; i >= 0 ; i--)
	    {
	    	char ch = str.charAt(i);
	    	rev += ch;
	    }
	    System.out.println("Orignal String : " + str);
	    System.out.println("result String : " + rev);
	}
}
