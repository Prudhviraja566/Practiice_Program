package Interview_Quections_Array;

public class Occurence_Array 
{
    public static void main(String[] args)
    {
    	int x [] = {12,88,46,23,12,89,46,12,89};
    	for(int i = 0 ; i < x.length ; i++)
    	{
    		int count = 0;
    		for(int j = 0 ; j < x.length ; j++)
    		{
    			if(x[i] == x[j] && i > j)
    			{
    				break;
    			}
    			if(x[i] == x[j])
    			{
    				count++;
    			}
    		}
    		if(count > 0)
    		{
    			System.out.println(x[i] + " --- >  " + count);
    		}
    	}
    }    
}

