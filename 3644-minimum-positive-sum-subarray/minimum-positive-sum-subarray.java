class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n = nums.size();
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }

        int minPositive = Integer.MAX_VALUE;
        for (int len = l; len <= r; len++) {
            for (int i = 0; i + len <= n; i++) {
                int sum = prefix[i + len] - prefix[i];
                if (sum > 0) {
                    minPositive = Math.min(minPositive, sum);
                }
            }
        }

        return minPositive == Integer.MAX_VALUE ? -1 : minPositive;
    }
}


