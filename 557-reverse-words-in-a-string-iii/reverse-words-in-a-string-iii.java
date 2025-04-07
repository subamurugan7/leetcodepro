class Solution {
    public String reverseWords(String s) {
       char[] ans = s.toCharArray();
        int i = 0;

        while (i < ans.length) {
            int j = i;
            while (j < ans.length && ans[j] != ' ') {
                j++;
            }
            reverse(ans, i, j - 1); 
            i = j + 1; 
        }

        return new String(ans);
    }

    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        } 
    }
}