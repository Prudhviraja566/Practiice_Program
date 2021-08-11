package Interview_Quections_Array;

public class Arrage_Word_In_order 
{
     public static void main(String[] args) 
     {
    	 String [] str = { "AAA", "AAAAA", "AA", "A"};
    	
    	 for (int i = 0; i < str.length; i++) 
    	 {
		    for (int j = i+1 ; j < str.length; j++) 
		    {
			   if(str[i].length() > str[j].length())
			   {
				   String temp = str[i];
				   str[i]=str[j];
				   str[j]=temp;
			   }
			}
		 }
    	 for(String s : str)
		    {
		    	System.out.println(s  + " ");
		    }
	 }
}
