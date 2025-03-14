class Solution {
    public int majorityElement(int[] nums) {
         HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            
            if (countMap.get(num) > nums.length / 2) {
                return num;
            }
        }
        
        return -1;
    }
}