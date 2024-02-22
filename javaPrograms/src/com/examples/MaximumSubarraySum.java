package com.examples;

public class MaximumSubarraySum {
   
    
    private static int maxSubarraySum2(int[] nums) {
    	int maxSum=nums[0];
    	int currentSum=nums[0];
		for(int i=1;i<nums.length;i++) {
			currentSum=Math.max(nums[i], nums[i]+currentSum);
			maxSum=Math.max(currentSum,maxSum);
		}
    	
		return maxSum;
	}
    
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, 1, 2, 1, 5, 4 };
       
        int maxSum2=maxSubarraySum2(nums);
        System.out.println(maxSum2);
        System.out.println("Maximum subarray sum: " + maxSum2);
    }



	
}
