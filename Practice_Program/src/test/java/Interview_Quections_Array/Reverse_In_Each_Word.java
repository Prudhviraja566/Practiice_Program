package Interview_Quections_Array;

public class Reverse_In_Each_Word 
{
    public static void main(String[] args) 
    {
	     String s = "Wish You Happy Holi";
	     String [] s1 = s.split(" ");
	     String res = "";
	     for(String str : s1)
	     {	 
	    	 char [] ch = str.toCharArray();  
	    	 for (int i = ch.length-1 ; i >= 0; i--) 
	    	 {
			    System.out.print(ch[i]);   
			 }
	    	System.out.print(" ");
	     }
	     System.out.println(res);
	}
}
