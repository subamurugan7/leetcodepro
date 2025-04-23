import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int num : nums) {
            ans.put(num, ans.getOrDefault(num, 0) + 1);
        }

       
        int n = nums.length;
        for (Map.Entry<Integer, Integer> entry : ans.entrySet()) {
            if (entry.getValue() > n / 3) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
