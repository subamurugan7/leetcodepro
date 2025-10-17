class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
         if (k == 0) {
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] != nums2[i]) return -1;
            }
            return 0;
        }
        long pos = 0;
        long neg = 0;
        
        for (int i = 0; i < nums1.length; i++) {
            long diff = nums2[i] - nums1[i];
            if (k != 0 && diff % k != 0) return -1;
            
            if (diff > 0) pos += diff;
            else neg += -diff; 
        }
        if (pos != neg) return -1;
        return pos / k;
    }
}
