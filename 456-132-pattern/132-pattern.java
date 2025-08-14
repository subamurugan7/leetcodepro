class Solution {
    public boolean find132pattern(int[] nums) {
      int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;
        
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < third) {
                return true; 
            }
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                third = stack.pop(); 
            }
            stack.push(nums[i]); 
        }
        
        return false;
    }
}