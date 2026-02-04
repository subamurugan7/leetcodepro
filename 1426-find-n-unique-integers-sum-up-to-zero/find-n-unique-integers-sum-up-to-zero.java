class Solution {
    public int[] sumZero(int n) {
       int[] ans = new int[n];
        int total = 0;
        for (int i = 0; i < n - 1; i++) {
            ans[i] = i - (n / 2);
            System.out.println(ans[i]);
            total += ans[i];
        }
        ans[n - 1] = -total;
        return ans;
    }
}