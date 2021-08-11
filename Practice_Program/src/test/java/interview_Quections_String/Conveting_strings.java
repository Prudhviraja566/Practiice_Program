package interview_Quections_String;

public class Conveting_strings 
{
	public static void main(String[] args) {
		
	String S ="AmithaB";
	String rev = "";
	
    
    for(int i = 0 ; i < S.length() ; i++)
    {
    	char ch = S.charAt(i);
    	
    	if(ch >= 'a' && ch <= 'z')
    	{
    		rev = rev + (ch+"").toUpperCase();
    	}
    	else if(ch >= 'A' && ch <= 'Z')
    	{
    		rev = rev + (ch+"").toLowerCase();
    	}
    }
    System.out.println(rev);
}
}

