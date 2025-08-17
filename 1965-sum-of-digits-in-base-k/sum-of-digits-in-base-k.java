class Solution {
    public int sumBase(int n, int k) {
       int ans=0;
       while(n>0){
        int mod=n%k;
        n=n/k;
        ans+=mod;
       } 
       return ans;
    }
}