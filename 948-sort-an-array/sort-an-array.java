class Solution {
    public int[] sortArray(int[] nums) {
     Arrays.sort(nums);
     return nums;
     
     /*for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]>nums[j]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
     }
     return nums;
     */   
    }
}