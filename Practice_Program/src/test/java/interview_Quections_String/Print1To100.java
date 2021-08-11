package interview_Quections_String;

public class Print1To100 
{
    public static void main(String[] args) 
    {
	    	print1To100(100);
	}
    public static int print1To100(int num)
    {
    	if(num > 0) {
    	print1To100(num-1);
    	System.out.println(num);
    	}
    	return num;
    }
    
}
