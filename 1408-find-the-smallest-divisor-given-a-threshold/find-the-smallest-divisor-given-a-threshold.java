class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int  end=0;
        for(int num:nums){
            if(end<num){
                end=num;
            }
        }
        int ans=end;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isvalid(nums,threshold,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    private boolean isvalid(int[] nums,int threshold,int divider){
        int sum=0;
        for(int num:nums){
          sum+=(num+divider-1)/divider;
          if(sum>threshold) return false;
        }
     return true;
    }
}