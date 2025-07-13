class Solution {
    public long continuousSubarrays(int[] nums) {
                long count = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.lastKey() - map.firstKey() > 2) {
                int leftNum = nums[left];
                map.put(leftNum, map.get(leftNum) - 1);
                if (map.get(leftNum) == 0) {
                    map.remove(leftNum);
                }
                left++;
            }
            count += (right - left + 1);
        }

        return count;
    }
}