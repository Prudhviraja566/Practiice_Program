package interview_Quections_String;

public class Occurance_String 
{
    public static void main(String[] args) 
    {
	   String s = "Jumukashmi";
	   s = s.toLowerCase();
	   
	   for(int i = 0 ; i < s.length() ; i++)
	   {
		   char ch = s.charAt(i);
		   int count = 0;
		   for(int j = 0 ;  j < s.length() ; j++)
		   {
			   char ch1 = s.charAt(j);
			   if(ch == ch1 && i > j)
			   {
				  break;
			   }
			   if(ch == ch1)
			   {
				   count++;
			   }
		   }
		   System.out.println(ch + " Present " + count + " Times ");
	   }
	}
}
