class Solution {
    public int xorOperation(int n, int start) {
      int sum=0;
      for(int i=start;i<n*2+start;i=i+2){
        sum=sum^i;
      }
      return sum;           
    }
}