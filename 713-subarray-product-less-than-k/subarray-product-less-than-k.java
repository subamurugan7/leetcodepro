class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1)
            return 0;

        int product = 1;
        int start = 0;
        int count = 0;

        for (int end = 0; end < nums.length; end++) {
            product *= nums[end];

            while (product >= k && start <= end) {
                product /= nums[start];
                start++;
            }

            count += end - start + 1;
        }

        return count;
    }
}