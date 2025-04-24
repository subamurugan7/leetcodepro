class Solution {
    public int minimumOperations(int[] nums) {
       int count=0;
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            int val=nums[i];
            for(int j=i;j<nums.length;j++){
                nums[j]-=val;
            }
            count++;
        }
       } 
       return count;
    }
}