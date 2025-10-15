class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int n = reward1.length;
        int total = 0;
        for (int r : reward2) total += r;
        Integer[] diff = new Integer[n];
        for (int i = 0; i < n; i++) {
            diff[i] = reward1[i] - reward2[i];
        }
        Arrays.sort(diff, (a, b) -> b - a);
        for (int i = 0; i < k; i++) total += diff[i];

        return total;
    }
}
