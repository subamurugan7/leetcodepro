class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = grumpy.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) ans += customers[i];
        }
        int curr = 0;  
        int extra = 0;
        int low = 0, high = 0;
        while (high < n) {
            if (grumpy[high] == 1) curr += customers[high];
            if (high >= low + minutes) {
                if (grumpy[low] == 1) curr -= customers[low];
                low++;
            }

            extra = Math.max(extra, curr);
            high++;
        }

        return ans + extra;
    }
}