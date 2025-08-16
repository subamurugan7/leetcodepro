class Solution {
    public boolean checkRecord(String s) {
        int ab = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'P')
                continue;
            else if (s.charAt(i) == 'A') {
                ab++;
                if (ab > 1)
                    return false;
            } else {
                int count = 0;
                while (i < s.length() && s.charAt(i) == 'L' && count < 3) {
                    count++;
                    i++;
                }
                if (count == 3)
                    return false;
                i--;
            }
        }
        return true;
    }
}