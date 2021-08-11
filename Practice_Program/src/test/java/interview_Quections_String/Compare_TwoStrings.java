package interview_Quections_String;

public class Compare_TwoStrings 
{
      public static void main(String[] args)
      {
		    String s = "abcde";
		    String s1 = "bce";
		    int count = 0;
		    int sum = s.length();
		    
		    for (int i = 0 ; i < s.length(); i++) 
		    { 
		    	  char ch = s.charAt(i);
		    	  for (int j = 0; j < s1.length(); j++) 
		    	  {
					  char ch1 = s1.charAt(j);
					  
					  if(ch == ch1)
					  {
						  count++;
					  }
				  }
				
			}
		    if(count == sum)
		    {
		    	System.out.println(s + " Present all characters " + s1);
		    }
		    else
		    {
		    	System.out.println(s + " Present not all caracters " + s1);
		    }
		
	  }
}
