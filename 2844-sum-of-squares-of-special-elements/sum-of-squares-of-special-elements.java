class Solution {
    public int sumOfSquares(int[] nums) {
     int n=nums.length;
     int productsum=0;
     for(int i=0;i<nums.length;i++){
        int pro=i+1;
        if(n%pro==0){
             int product=nums[i]*nums[i];
             productsum+=product;
        }
     }
     return productsum;
    }
}