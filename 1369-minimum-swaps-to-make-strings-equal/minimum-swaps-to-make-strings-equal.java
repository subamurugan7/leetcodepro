class Solution {
    public int minimumSwap(String s1, String s2) {
        int xyCount = 0;
        int yxCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 == 'x' && c2 == 'y') {
                xyCount++;
            } else if (c1 == 'y' && c2 == 'x') {
                yxCount++;
            }
        }
        if ((xyCount + yxCount) % 2 != 0) return -1;
        int swaps = xyCount / 2 + yxCount / 2;
        if (xyCount % 2 == 1) swaps += 2; 
        return swaps;
    }
}
