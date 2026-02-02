class Solution {
    public int countPartitions(int[] nums) {
      int count=0;
      int sum1=0;
      for(int i=0;i<nums.length-1;i++){
        sum1+=nums[i];
        int sum2=0;
        for(int j=i+1;j<nums.length;j++){
            sum2+=nums[j];
        }
        int sum=sum1-sum2;
        if(sum%2==0) count++;
      }  
      return count;
    }
}