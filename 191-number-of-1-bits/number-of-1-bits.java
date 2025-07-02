class Solution {
    public int hammingWeight(int n) {
     int count=0;   
     int mod=0;
     int div=0;
     while(n>0){
        mod=n%2;
        div=n/2;
        n=div;
        if(mod==1){
          count++;
        }
     }   
     return count;
    }
}