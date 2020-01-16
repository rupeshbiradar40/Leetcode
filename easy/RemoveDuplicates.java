package easy;

public class RemoveDuplicates {
	
	static int[] nums = {0,0,1,1,1,2,2,3,3,4};

	public static void main(String[] args) 
	{
		 int count=0;
	        for(int i=0;i<nums.length-1;i++)
	        {
	          if (nums[i]==nums[i+1])
	          {
	        	  nums[count]=nums[i];
	              continue;
	          }
	           else if (nums[i]!=nums[i+1])
	           {
	               count++;
	               nums[count]=nums[i+1];
	           }
	        }
		System.out.println(count+1);

		for (int i=0; i<=count;i++)
		{
			System.out.println(nums[i]);
		}
	}

}
