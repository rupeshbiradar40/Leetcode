package easy;

public class StrStr {
	
	public int checkStrstrHashStack(String haystack, String needle)
	{
		int count=0;
		if(needle.length()==0)
        {
            return 0;
        }
        else if(needle.length()>haystack.length())
        {
            return -1;
        }
        else
        {
		   for(int i=0;i<haystack.length();i++)
		     {
			   if(haystack.charAt(i)==needle.charAt(0))
			     {
				    int temp=i; count=1;
				    for(int j=1;j<needle.length();j++)
				      {
					    temp++;
					    if (temp<haystack.length())
					      {
					         if(needle.charAt(j)==haystack.charAt(temp))
					          {
						        count++;
					          }
					      }
				        else
					      {
						     System.out.println("No substing Matched");
						     return -1;
					      }
				      }
			     }
			   if(count==needle.length())
			     {
				   System.out.println(i);
				    return i;
			     }
			   else
				continue;
		} 
		if(count!=needle.length())
		{
		       System.out.println("No substing Matched");
		       return -1;
	    }
		return -1;
        }
	}
	public static void main(String[] args) 
	{
		StrStr str = new StrStr();
		str.checkStrstrHashStack("mississippi", "issipi");

	}

}
