class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0;

        // 1️⃣ Forward pass: compute decoded length
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                size *= (c - '0');
            } else {
                size++;
            }
        }

        // 2️⃣ Backward pass: find k-th character
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                size /= (c - '0');
                k %= size;
                if (k == 0) k = (int) size;
            } else {
                if (k == size) {
                    return String.valueOf(c);
                }
                size--;
            }
        }
        return "";
    }
}
