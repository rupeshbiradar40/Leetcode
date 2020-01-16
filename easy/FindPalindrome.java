package easy;

public class FindPalindrome {
	
	public boolean isPalindrome(int x) 
    {
       int i;
       String s = String.valueOf(x);
       System.out.println(s);
       int n=s.length();
       
    for( i=0;i<n/2;i++) 
    {
    	if(s.charAt(i)!=s.charAt(n-i-1))
    	{
    		return false;
    	}
   
    }
    return true;
 }	

	public static void main(String[] args) {
		FindPalindrome str = new FindPalindrome();
		str.isPalindrome(1441);
	}

}
