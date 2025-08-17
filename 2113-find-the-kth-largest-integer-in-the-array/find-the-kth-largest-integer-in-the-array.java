import java.util.*;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }
            return a.compareTo(b); 
        });
        
        int n = nums.length;
        return nums[n - k];
    }
}
