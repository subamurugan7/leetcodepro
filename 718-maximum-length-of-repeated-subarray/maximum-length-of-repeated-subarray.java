class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            maxLen = Math.max(maxLen, maxLength(nums1, i, nums2, 0, Math.min(n - i, m)));
        }
        for (int j = 0; j < m; j++) {
            maxLen = Math.max(maxLen, maxLength(nums1, 0, nums2, j, Math.min(m - j, n)));
        }

        return maxLen;
    }

    private int maxLength(int[] nums1, int i, int[] nums2, int j, int len) {
        int k = 0, max = 0;
        for (int p = 0; p < len; p++) {
            if (nums1[i + p] == nums2[j + p]) {
                k++;
                max = Math.max(max, k);
            } else {
                k = 0;
            }
        }
        return max;
    }
}
