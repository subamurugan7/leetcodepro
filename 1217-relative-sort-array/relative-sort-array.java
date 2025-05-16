import java.util.Arrays;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        int k = 0;

        
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    ans[k++] = arr1[j];
                    arr1[j] = -1; 
                }
            }
        }

        int[] remaining = new int[arr1.length - k];
        int r = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                remaining[r++] = arr1[i];
            }
        }

       
        Arrays.sort(remaining);

        
        for (int i = 0; i < remaining.length; i++) {
            ans[k++] = remaining[i];
        }

        return ans;
    }
}
