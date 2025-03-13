class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new LinkedList<>();
        int n = num.length;
        int carry = k;
        int i = n - 1;

        while (i >= 0 || carry > 0) {
            if (i >= 0) {
                carry += num[i];
                i--;
            }
            result.add(0, carry % 10);  // Insert at the beginning
            carry /= 10;
        }
        return result; 
    }
}