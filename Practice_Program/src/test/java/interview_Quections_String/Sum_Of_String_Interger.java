package interview_Quections_String;

public class Sum_Of_String_Interger 
{
	public static void main(String[] args) 
	{
	   String s = "abc146gt678ki";
	   
	   String rev = "";
	   
	   int sum = 0;
	   
	   for(int i = 0 ; i < s.length() ; i++)
	   {
		   char ch = s.charAt(i);
		   
		   if(ch >= 'a' && ch <= 'z')
		   {
			   rev = rev + ch + "";
		   }
		   else
		   {
			   int sum1 = Integer.parseInt(String.valueOf(ch));
			   sum = sum  + sum1 ;
		   }
	   }
	   
	   System.out.println(rev);
	   System.out.println(sum);
	}
}
