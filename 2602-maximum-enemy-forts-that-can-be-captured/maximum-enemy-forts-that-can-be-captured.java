class Solution {
    public int captureForts(int[] forts) {
        int max = 0;
        int prev = -1;  

        for (int i = 0; i < forts.length; i++) {
            if (forts[i] == 1 || forts[i] == -1) {
                if (prev != -1 && forts[i] != forts[prev]) {
                    int captured = i - prev - 1;
                    max = Math.max(max, captured);
                }
                prev = i; 
            }
        }
        return max;
    }
}
