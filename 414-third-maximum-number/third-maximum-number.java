class Solution {
    public int thirdMax(int[] nums) {
       Arrays.sort(nums);
       if(nums.length<3){
        return nums[nums.length-1];
       } 
       int c=1;
       for(int i=nums.length-1;i>0;i--){
        if(nums[i]!=nums[i-1]){
            c+=1;
        }
        if(c==3){
            return nums[i-1];
        }
       }
       return nums[nums.length-1];
    }
}