package easy;

public class SearchMaxSubstring {
	
	

	public static void main(String[] args)
	{
		String [] str= {"cs","s"};
		String substring="";
		boolean flag=false;
		int count=0;
		if (str.length==0)
		{
			System.out.println("");
		}
		else
		{
			String smallest=str[0];
		for(int i=0;i<str.length;i++)
        {
           if(str[i].length()<smallest.length()) 
           {
               smallest = str[i];
           }
        }
		for(int i=0;i<smallest.length();i++)
		{
			for(int j=0;j<str.length;j++)
			{
				if (smallest.charAt(i)==str[j].charAt(i))
				{
					count++;
				}
				else if(smallest.charAt(i)!=str[j].charAt(i))
				{
				  break;
				}
				
			}
			
			if(count==str.length)
			{
				substring=substring + smallest.charAt(i);
				count=0;
				flag=true;
			}
			else
			{ 
				break;
			}
		}
		if (flag==true)
		{
			System.out.println(substring);		
		}
		else
		{
			System.out.println("no substring found");
		}
	}
	}
}
