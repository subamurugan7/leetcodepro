class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] windowSum = new int[n - k + 1];
        int sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];
        windowSum[0] = sum;
        for (int i = 1; i < windowSum.length; i++) {
            sum += nums[i + k - 1] - nums[i - 1];
            windowSum[i] = sum;
        }
        int[] left = new int[windowSum.length];
        int bestLeft = 0;
        for (int i = 0; i < windowSum.length; i++) {
            if (windowSum[i] > windowSum[bestLeft]) bestLeft = i;
            left[i] = bestLeft;
        }
        int[] right = new int[windowSum.length];
        int bestRight = windowSum.length - 1;
        for (int i = windowSum.length - 1; i >= 0; i--) {
            if (windowSum[i] >= windowSum[bestRight]) bestRight = i;
            right[i] = bestRight;
        }
        int maxTotal = 0;
        int[] result = new int[3];
        for (int mid = k; mid < windowSum.length - k; mid++) {
            int l = left[mid - k];
            int r = right[mid + k];
            int total = windowSum[l] + windowSum[mid] + windowSum[r];
            if (total > maxTotal) {
                maxTotal = total;
                result[0] = l;
                result[1] = mid;
                result[2] = r;
            }
        }

        return result;
    }
}