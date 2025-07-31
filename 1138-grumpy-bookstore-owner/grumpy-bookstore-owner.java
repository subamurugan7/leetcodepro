class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sat = 0;
        for (int i = 0; i < grumpy.length; i++) {
            if (grumpy[i] == 0) sat += customers[i];
        }
        int extrasat = 0;
        int current=0;
        int left= 0, right = 0;
        while (right< grumpy.length) {
            if (grumpy[right] == 1) current += customers[right];
            if (right-left+1 > minutes) {
                if (grumpy[left] == 1) current-= customers[left];
                left++;
            }

            extrasat = Math.max(extrasat, current);
            right++;
        }

        return  sat+extrasat;
    }
}