class Solution {
    public int[] leftRightDifference(int[] nums) {
       int[] leftsum=new int[nums.length];
       int[] rightsum=new int[nums.length];  
       for(int i=0;i<nums.length;i++){
        int l=0;
        for(int j=0;j<i;j++){
          l+=nums[j];
        }
        leftsum[i]=l;
       }
       for(int i=nums.length-1;i>=0;i--){
        int r=0;
        for(int j=i+1;j<nums.length;j++){
            r+=nums[j];
        }
        rightsum[i]=r;
       }
       for(int i=0;i<nums.length;i++){
        nums[i]=Math.abs(leftsum[i]-rightsum[i]);
       }
       return nums;
    }
}