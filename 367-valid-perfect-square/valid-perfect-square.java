class Solution {
    public boolean isPerfectSquare(int num) {
       if(num==0 || num==1){
            return true;
       }
       int start=1,end=num;
       while(start<=end){
        int mid=start+(end-start)/2;
        long sum=(long)mid*mid;
            if(sum==num){
                return true;
            }
            else if(sum>num){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
       }
       return false; 
    }
}