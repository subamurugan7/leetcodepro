class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] ans = new int[n];
        int[][] indexintervals = new int[n][3];
        for (int i = 0; i < intervals.length; i++) {
            indexintervals[i] = new int[] { intervals[i][0], intervals[i][1], i };
        }
        Arrays.sort(indexintervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < n; i++) {
            int end = intervals[i][1];
            int l = 0, r = n - 1, index = -1;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (indexintervals[m][0] >= end) {
                    index = indexintervals[m][2];
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
            ans[i] = index;
        }
        return ans;
    }
}