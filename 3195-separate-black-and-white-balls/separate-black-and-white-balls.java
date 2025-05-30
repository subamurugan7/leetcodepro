class Solution {
    public long minimumSteps(String s) {
        long steps = 0;
        int ones = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            } else if (c == '0') {
                steps += ones;
            }
        }

        return steps;
    }
}
