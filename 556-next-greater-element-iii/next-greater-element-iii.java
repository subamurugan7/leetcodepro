public class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = Integer.toString(n).toCharArray();

        // Step 1: Find the first decreasing digit from right
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // If no such digit is found, return -1
        if (i < 0) return -1;

        // Step 2: Find the smallest digit on right side which is greater than digits[i]
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Step 3: Swap
        swap(digits, i, j);

        // Step 4: Reverse the right part
        reverse(digits, i + 1, digits.length - 1);

        // Step 5: Convert back to number
        long result = Long.parseLong(new String(digits));
        return (result <= Integer.MAX_VALUE) ? (int) result : -1;
    }

    // Swap helper
    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse helper
    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
