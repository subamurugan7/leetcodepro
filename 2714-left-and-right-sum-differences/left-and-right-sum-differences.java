class Solution {
    public int[] leftRightDifference(int[] nums) {
     int n=nums.length;
     int[] prefix=new int[n];
     prefix[0]=0;
     for(int i=1;i<n;i++){
       prefix[i]=nums[i-1]+prefix[i-1];
     } 
     int[] suffix=new int[n];
     suffix[n-1]=0;
     for(int i=n-2;i>=0;i--){
        suffix[i]=nums[i+1]+suffix[i+1];
     }
     int[] ans=new int[n];
     for(int i=0;i<nums.length;i++){
        ans[i]=Math.abs(prefix[i]-suffix[i]);
     }
     return ans;
    }
}