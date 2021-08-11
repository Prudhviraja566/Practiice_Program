package interview_Quections_String;

public class Duplicate_characters 
{
    public static void main(String[] args) 
    {
	    String str = "Mahabarat";
	    str = str.toLowerCase();
	    String rev = str;
	    
	    for(int i = 0 ; i < str.length() ; i++)
	    {
	    	char ch = str.charAt(i);
	    	int count = 0;
	    	for(int j = 0 ; j < str.length() ; j++)
	    	{
	    		char ch1 = str.charAt(j);
	    		if(ch == ch1 && i > j)
	    		{
	    			break;
	    		}
	    		if(ch == ch1)
	    		{
	    			count++;
	    		}
	    	}
	    	if(count > 1)
	    	{
	    		rev =rev.replace(ch+"", "");
	    	}
	    }
	    System.out.println(str);
	    System.out.println(rev);
	}
}
