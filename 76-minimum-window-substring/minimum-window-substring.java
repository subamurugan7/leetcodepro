class Solution {
    private int charToIndex(char c) {
        return Character.isUpperCase(c) ? c - 'A' : c - 'a' + 26;
    }
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[] freq = new int[52];
        for (char ch : t.toCharArray()) {
            freq[charToIndex(ch)]++;
        }
        int left = 0, right = 0, count = 0;
        int minLen = Integer.MAX_VALUE, startIndex = 0;
        int[] windowFreq = new int[52];
        while (right < n) {
            char curr = s.charAt(right);
            int currIdx = charToIndex(curr);
            windowFreq[currIdx]++;
            if (windowFreq[currIdx] <= freq[currIdx]) {
                count++;
            }
            while (count == m) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }
                char leftChar = s.charAt(left);
                int leftIdx = charToIndex(leftChar);
                windowFreq[leftIdx]--;
                if (windowFreq[leftIdx] < freq[leftIdx]) {
                    count--;
                }
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}
