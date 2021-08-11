package interview_Quections_String;

public class Vowels_String 
{
     public static void main(String[] args) 
     {
	    String s = "Mahabarat u";
	    s = s.toLowerCase();
	    String s1 = "aeiou";
	    
	    for(int i = 0 ; i < s1.length() ; i++)
	    {
	    	char ch = s1.charAt(i);
	    	int count = 0;
	    	for(int j = 0 ; j < s.length() ; j++)
	    	{
	    		char ch1 = s.charAt(j);
	    		
	    		if(ch == ch1)
	    		{
	    			count++;
	    		}
	    	}
	    	if(count >= 1)
	    	{
	    		System.out.println(ch + " present " + count + " Times ");
	    	}
	    	
	    }
	    
	 }
}
