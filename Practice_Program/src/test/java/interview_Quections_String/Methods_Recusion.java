package interview_Quections_String;

public class Methods_Recusion 
{
      public static void main(String[] args) 
      {
		  String str = "Prudhvi raj";
		  int count = 0;
		  char [] ch = str.toCharArray();
		  
		  for(char s1 : ch)
		  {
			  count++;
		  }
		  
		  System.out.println("String Length : " + count); 
	  }
}
