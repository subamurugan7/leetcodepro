class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int ans = 0;
        for (int i = 0; i < grumpy.length; i++) {
            if (grumpy[i] == 0) ans += customers[i];
        }
        int curr = 0;  
        int extra = 0;
        int left= 0, right = 0;
        while (right< grumpy.length) {
            if (grumpy[right] == 1) ans += customers[right];
            if (right-left+1 > minutes) {
                if (grumpy[left] == 1) ans -= customers[left];
                left++;
            }

            extra = Math.max(extra, ans);
            right++;
        }

        return  extra;
    }
}