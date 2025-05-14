class Solution {
    public int maximumCount(int[] nums) {
       int poscount=0;
       int negcount=0;
       for(int i=0;i<nums.length;i++){
          if(nums[i]>0){
            negcount++;
          }
          else if(nums[i]<0){
            poscount++;
          }
       } 
       if(poscount<=negcount){
        return negcount;
       }
       return poscount;
    }
}