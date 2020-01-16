package easy;

public class RemoveNumber {

	public static void main(String[] args) 
		 {
			 int[] nums={2,3,3};
			 int val=3;
		        int count=0;
		        int front_counter=0;
		        int back_counter=nums.length-1;
		        for(int i=0;i<nums.length;i++)
		        {
		            if(nums[i]==val)
		                count++;
		        }
		   
		         while(front_counter<=back_counter)
			       {
		              if((nums[front_counter]==val)&&(nums[front_counter]!=nums[back_counter]))
		               {
		                  int temp=nums[front_counter];
		                  nums[front_counter]=nums[back_counter];
		                  nums[back_counter]=temp;
		                  back_counter--;
		                  front_counter++;
		               }
		              
		              else if ((nums[front_counter]==val)&&(nums.length==count)) 
		               {
		            	  System.out.print("array with only 1 element");
		            	  break;
		               }
		              
		              else if ((nums[front_counter]==val)&&(nums[front_counter]==nums[back_counter]))
		               {
		            	  if (front_counter==back_counter)
		            	  {
		            		  break;
		            	  }
		            	  while((nums[back_counter]==nums[front_counter])&&(front_counter<back_counter))
		            	    {
		            		  back_counter--;
		            	    }
		            	  int temp=nums[front_counter];
		                  nums[front_counter]=nums[back_counter];
		                  nums[back_counter]=temp;
		                  back_counter--;
		                  front_counter++;
		               }
		             
		              else 
		               {
		            	  front_counter++;
		               }
		        	}
		           for(int i=0;i<nums.length-count;i++)
			        {
			        	System.out.println(nums[i]);
			        }
		        }
		       
	}


