package Interview_Quections_Array;

public class Ascending_Sort 
{
     public static void main(String[] args) 
     {
	   int x[] = {45, 58,59, 46, 12, 78};
	   for(int i : x)
	   {
		   System.out.print(i + " ");
	   }
	   
	   System.out.println("\n-----------------------");
	   
	   for (int i = 0; i < x.length; i++) 
	   {
		 for (int j = 0; j < x.length; j++) 
		 {
		    if(x[i] > x[j])
		    {
		    	int temp = x[i];
		    	x[i] = x[j];
		    	x[j] = temp;
		    }
		 }
	   }
	   System.out.println("After asceed sort");
	   for(int i : x)
	   {
		   System.out.print(i + " ");
	   }
	 }
}
