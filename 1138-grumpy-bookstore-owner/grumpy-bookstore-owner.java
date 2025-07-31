class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = grumpy.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) ans += customers[i];
        }
        int curr = 0;  
        int extra = 0;
        int left= 0, right = 0;
        while (right< n) {
            if (grumpy[right] == 1) curr += customers[right];
            if (right >=left+ minutes) {
                if (grumpy[left] == 1) curr -= customers[left];
                left++;
            }

            extra = Math.max(extra, curr);
            right++;
        }

        return ans + extra;
    }
}