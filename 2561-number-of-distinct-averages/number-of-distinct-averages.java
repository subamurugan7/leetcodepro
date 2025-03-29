class Solution {
    public int distinctAverages(int[] nums) {
      Arrays.sort(nums);
      Set<Double> ans=new HashSet<>();
      int i=0,j=nums.length-1;
      while(i<j){
         double avg=(nums[i]+nums[j])/2.0;
         ans.add(avg);
         i++;
         j--;
      } 
      
      return ans.size();
    }
}