package easy;

public class TwoSum {
	
	public int[] calculateTwoSum(int[] nums, int target) {
        int i,j;
        int [] array=new int[2];
        int len = nums.length-1;
        for (i=0;i<nums.length;i++)
        {
            for (j=len; j>=0;j--)
            {
               if((i!=j)&&(nums[i]+nums[j]==target))
                {
                    array[0]=i;
                    array[1]=j;        
                } 
            }
        }
        return array;
    }
	public static void main(String[] args) 
	{
		int[] nums = {0,2,5,7,4,9,13,24,57};
		TwoSum ts = new TwoSum();
		ts.calculateTwoSum(nums, 9);	
	}

}
