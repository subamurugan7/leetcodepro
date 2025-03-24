class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i <= nums.length; i++) {
            int s = 0, e = nums.length - 1, c = 0;
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (nums[m] >= i) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
            c = nums.length - s;
            if (c == i) {
                return i;
            }
        }
        return -1;
    }
}
// class Solution {
// public int specialArray(int[] nums) {
// Arrays.sort(nums);
// for (int i = 1; i <= nums.length; i++) {
// int c = 0;
// for (int j = 0; j < nums.length; j++) {

// if (nums[j] >= i) {
// c = c + 1;
// }
// }
// }
// if (c == i) {
// return i;
// }
// }
// return -1;
// }
// }
//