class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            boolean valid = true;
            for (int j = i + 1; j < i + k; j++) {
                if (nums[j] != nums[j - 1] + 1) {
                    valid = false;
                    break;
                }
            }

            result[i] = valid ? nums[i + k - 1] : -1;
        }

        return result;
    }
}