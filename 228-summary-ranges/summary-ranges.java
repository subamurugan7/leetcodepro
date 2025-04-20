class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        
        while (i < nums.length) {
            int start = i;
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            if (start == i) {
                ans.add(String.valueOf(nums[start]));
            } else {
                ans.add(nums[start] + "->" + nums[i]);
            }
            i++;
        }
        return ans;
    }
}