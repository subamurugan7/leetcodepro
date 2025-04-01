class Solution {
    public int maxProduct(int[] nums) {
      Arrays.sort(nums);
      int i=nums.length-1;
      int ans=(nums[i]-1)*(nums[i-1]-1);
      return ans;  
    }
}