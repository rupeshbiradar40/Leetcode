package easy;

public class ReverseNumber {
	
	public static int reverseno(int x)
	{
		 if(x>=(1534236469))
	            return 0;
	        boolean isPos = true;
		    int rem=0, newNum=0;
	        if(x<0) 
	         {
	            isPos = false;
	            x=-x;
	              while(x>0) 
	              {
	                rem=x%10;
	                newNum = newNum*10 + rem;
	                x = x/10;
	               }    
	           }
	          else if((x>0))
	          {
	            while(x>0) 
	            {
	                rem=x%10;
	                newNum = newNum*10 + rem;
	                x = x/10;
	            }
	          }
	          if(isPos)
	             return newNum;
	          else 
	              return (-newNum);
	      }
	
	public static void main(String[] args) {
		
		ReverseNumber.reverseno(1534236469);

	}

}
