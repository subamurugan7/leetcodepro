class Solution {
    public int arrangeCoins(int n) {
      int s=0;
      int e=n,ans=0;
      while(s<=e){
        int mid=s+(e-s)/2;
        long value=(long)mid*(mid+1)/2;
        if(value>n){
            e=mid-1;
        }
        else{
            s=mid+1;
            ans=Math.max(ans,mid);
        }
      }
      return ans;
    }
}