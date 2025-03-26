class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] result = new int[n];

        int[][] indexedIntervals = new int[n][3];
        for (int i = 0; i < n; i++) {
            indexedIntervals[i] = new int[] { intervals[i][0], intervals[i][1], i };
        }

        Arrays.sort(indexedIntervals, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            int end = indexedIntervals[i][1];
            int left = 0, right = n - 1, idx = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (indexedIntervals[mid][0] >= end) {
                    idx = indexedIntervals[mid][2];
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            result[indexedIntervals[i][2]] = idx;
        }

        return result;
    }
}