package interview_Quections_String;

public class Convert_into_FirstLetter 
{
    public static void main(String[] args) 
    {
	     String s = "my name is prudhvi raj";
	     String [] str = s.split(" ");
	     String res = "";
	     
	     for(String word : str)
	     {
	    	 char []  ch = word.toCharArray();
	    	 char ch1 = ch[0];
	    	 String Exp = String.valueOf(ch1).toUpperCase();
	    	 for (int i = 1; i < ch.length; i++) 
	    	 {
				Exp = Exp + ch[i];
			 }
	    	
	    	 res = res + Exp + " "; 
	     }
	     
	     System.out.println(res);
	     
	}
}
