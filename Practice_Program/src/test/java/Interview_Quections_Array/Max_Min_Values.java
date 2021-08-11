package Interview_Quections_Array;

public class Max_Min_Values 
{
     public static void main(String[] args) 
     {
	  int [] x = {55, 76, 81, 45, 12};
	  int max =x[0];
	  int min = x[0];
	  
	  for(int i : x)
	  {
		  if(max  < i)
		  {
			  max  = i;
		  }
		  else if(min > i)
		  {
			  min = i;
		  }
	  }
    	 
	  System.out.println("max is : " + max);
	  System.out.println("min is  :" +min);
	}
}
