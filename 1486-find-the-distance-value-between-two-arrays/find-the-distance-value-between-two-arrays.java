import java.util.Arrays;

public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        // Sort arr2 for efficient checking
        Arrays.sort(arr2);
        
        int count = 0;
        
        for (int num1 : arr1) {
            boolean isValid = true;
            
            // Binary search to find the closest element in arr2
            int left = 0, right = arr2.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (Math.abs(arr2[mid] - num1) <= d) {
                    isValid = false; // If such a pair exists, mark as invalid
                    break;
                } else if (arr2[mid] < num1) {
                    left = mid + 1; // Move right
                } else {
                    right = mid - 1; // Move left
                }
            }
            
            // If no pair was found, increment the count
            if (isValid) {
                count++;
            }
        }
        
        return count;
    }
}
