class Solution {
    public int[] runningSum(int[] nums) {
     int temp=0;
     for(int i=0;i<nums.length;i++){
        nums[i]=nums[i]+temp;
        temp=nums[i];
     }  
     return nums; 
    }
}