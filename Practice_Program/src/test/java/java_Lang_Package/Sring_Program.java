package java_Lang_Package;

public class Sring_Program 
{
    public static void main(String[] args) 
    {
	   String str = " Hello All Good Morning";
	   String Str2 = str.replaceAll(" ", "");
	   
	   System.out.println(str);
	   System.out.println(Str2);
	}
}

class ReversString
{
	public static void main(String[] args) 
	{
		String str = "Prudhvi Raj";
		String rev = " ";
		System.out.println(str.length());
		
		for(int i = str.length()-1 ; i >= 0 ; i--)
		{
			char ch = str.charAt(i);
			rev += ch;
		}
		System.out.println(str);
		System.out.println(rev);	
	}
}

class Occurance
{
	public static void main(String[] args) 
	{
	    String str = "Prudhviraj";
	    str =  str.toLowerCase();
	    System.out.println(str);
	    int count = 0;
	    char reqchar = 'r';
	    
	    for(int i = 0; i < str.length(); i++)
	    {
	        char ch = str.charAt(i);
	        if(ch == reqchar)
	        {
	        	count++;
	        }
	    }
	    System.out.println(reqchar +  " Present " + count + " times ");
	}
}


class DemoString
{
	public static void main(String[] args) 
	{
		String Str = "Mahabharat";
		Str = Str.toLowerCase();
		
		while(!Str.equals(""))
		{
			String ch = Str.charAt(0) + "";
			String s1 = Str.replace(ch, "");
			int count = Str.length()-s1.length();
			Str = s1;
			
			if(count > 1)
			{
				System.out.println( ch + " present " + count + " times ");
			}
		}
	}
}

class OccranceVowels
{
	public static void main(String[] args) 
	{
	    String Str = "Mahabarathe o u i";
	    Str = Str.toLowerCase();
	    String s1 = "aeiou";
	    
	    for (int i = 0 ; i <s1.length(); i++)
	    {
	    	char ch = s1.charAt(i);
	    	int count = 0;
	      for(int j = 0 ; j < Str.length(); j++)
	      {
	    	  char ch1 = Str.charAt(j);
	    	  if(ch1 == ch)
	    	  {
	    		  count++;
	    	  }
	      }
	      
	      if (count >= 1 )
	      {
	    	  System.out.println(ch + " Present " + count + " times ");
	      }
	    }
	}
}



class RemoveDuplicate
{
	public static void main(String[] args) 
	{
	   String Str = "Mahabarath";
	   Str = Str.toLowerCase();
	   String s = Str;
	   
	   for(int i = 0; i < Str.length(); i++)
	   {
		   char ch = Str.charAt(i);
		   int count = 0;
		   for(int j = 0 ; j < Str.length() ; j++)
		   {
			   char ch1  = Str.charAt(j);
			   
			   if(ch == ch1 && i > j)
			   {
				   break;
			   }
			   if(ch == ch1)
			   {
				   count++;
			   }
		   }
		   if(count > 1 )
		   {
			   s= s.replace(ch + "", "");
		   }
	   }
	   System.out.println(Str);
	   System.out.println(s);
	}
}


class DemoString1
{
	public static void main(String[] args) 
	{
	   String s = "abc194hikm457kid";
	   String str = "";
	   int sum = 0;
	    
	   for(int i = 0 ; i < s.length() ; i++)
	   {
		   char ch = s.charAt(i);
		   
			   if(ch == '0' && ch == '9')
			   {
				   sum = sum + ch;
			   }
		}
	   System.out.println(str);
	   System.out.println(sum);
	}
}