class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i <= nums.length; i++) {
            int c = 0;
            for (int j = 0; j < nums.length; j++) {

                if (nums[j] >= i) {
                    c = c + 1;
                }
            }
            if (c == i) {
                return i;
            }
        }
        return -1;
    }
}