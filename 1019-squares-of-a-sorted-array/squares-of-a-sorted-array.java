class Solution {
    public int[] sortedSquares(int[] nums) {
     /*   int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int j=Math.abs(nums[i]);
            ans[i]=j*j;
        }
        Arrays.sort(ans);
        return ans;
     */
     /*for(int i=0;i<nums.length;i++){
            int j=Math.abs(nums[i]);
            nums[i]=j*j;
    }
    Arrays.sort(nums);
    return nums;
    */
    int[] ans=new int[nums.length];
    int l=0,r=nums.length-1;
    int leftpointer=nums.length-1;
    while(l<=r){
        int squareofl=nums[l]*nums[l];
        int squareofr=nums[r]*nums[r];
        if(squareofl<squareofr){
            ans[leftpointer--]=squareofr;
            r--;
        }
        else{
             ans[leftpointer--]=squareofl;
             l++;
        }
    }
    return ans;
    }
}