class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
      Map<Integer,Integer> freq=new HashMap<>();
      long currsum=0,maxsum=0;
      int left=0,right=0;
      while(right<nums.length){
        int val=nums[right];
        currsum+=val;
        freq.put(val,freq.getOrDefault(val,0)+1);
        int windowsize=right-left+1;
        if(windowsize==k&&freq.get(val)==1){
            maxsum=Math.max(maxsum,currsum);
            int leftval=nums[left];
            currsum-=leftval;
            freq.put(leftval,freq.get(leftval)-1);
            left++;
        }
        while(freq.get(val)>1){
            int leftval=nums[left];
            currsum-=leftval;
            freq.put(leftval,freq.get(leftval)-1);
            left++;
        }
        right++;
      }  
      return maxsum;
    }
}