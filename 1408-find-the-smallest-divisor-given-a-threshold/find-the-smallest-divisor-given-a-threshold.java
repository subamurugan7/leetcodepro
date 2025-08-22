class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1; 
        int right = 0;
        for (int num : nums) {
            right = Math.max(right, num);
        }

        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDivide(nums, threshold, mid)) {
                ans = mid;
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }
        return ans;
    }

    private boolean canDivide(int[] nums, int threshold, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;
            if (sum > threshold) return false;
        }
        return sum <= threshold;
    }
}
