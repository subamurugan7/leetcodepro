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
     for(int i=0;i<nums.length;i++){
            int j=Math.abs(nums[i]);
            nums[i]=j*j;
    }
    Arrays.sort(nums);
    return nums;
    }
}