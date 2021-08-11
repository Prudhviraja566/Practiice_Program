package Interview_Quections_Array;

public class Reverse_String 
{
	public static void main(String[] args) 
	{
		String s = "wish you all happy holi";
		String [] str = s.split(" ");
		String [] str2 =  new String[str.length];
		
		for(String str1 : str)
		{
			System.out.println(str1);
		}
		int count = 0;
		
		
		for(int i = str.length-1; i >= 0 ; i--)
		{
			str2[count++] = str[i];
		}
		
		for(String str3 : str2)
		{
			System.out.print(str3 + " ");
		}
	}
}
