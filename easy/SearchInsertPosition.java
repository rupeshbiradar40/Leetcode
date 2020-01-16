package easy;

public class SearchInsertPosition 
{
	 public int searchInsert(int[] nums, int target) 
	 { 
	        int flag=0;
	        for (int i=0;i<nums.length;i++)
	        {
	            if(nums[i]==target)
	            {
	                flag=i;
	                return flag;
	            }
	            
	        }
	        if(flag==0)
	        {
	            for(int i=0;i<nums.length;i++)
	            {
	                if(nums[i]>target)    
	                {
	                	flag=i;
	                    return i;
	                }
	            }
	        }
	        else if((flag==0)&&(target>nums[nums.length-1]))
	        {
	        	return nums.length;
	        }
	        else if ((flag==0)&&(target<nums[0]))
	        {
	        	 return 0;
	        }
	           return 0;
			  
	    }

	public static void main(String[] args) 
	{
		
	}

}
