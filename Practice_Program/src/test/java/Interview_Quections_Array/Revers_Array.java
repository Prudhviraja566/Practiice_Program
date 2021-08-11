package Interview_Quections_Array;

public class Revers_Array 
{
	public static void main(String[] args) 
	{
     int [] x = {45,58,59,12,46,78};
     System.out.println(x.length);
     for(int i : x)
     {
    	 System.out.print(i + " ");
     }
     
     System.out.println("--------------------");
     int rev [] = new int[x.length];
     
     int count = 0;
     for(int k = x.length -1  ; k >= 0 ; k--)
     {
    	 rev[count++] = x[k];
     }
     for(int j : rev)
     {
    	 System.out.print(j + " ");
     }
	}
	
}
