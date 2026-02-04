class Solution {
    public int subtractProductAndSum(int n) {
      int sum=0;
      int val=1;
      while(n>0){
        int digit=n%10;
        sum+=digit;
        val*=digit;
        n=n/10;
      }  
      return val-sum;
    }
}