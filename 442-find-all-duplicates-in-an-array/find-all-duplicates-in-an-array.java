class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       ArrayList<Integer> duplicate=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        int val=Math.abs(nums[i]);
        if(nums[val-1]<0){
            duplicate.add(val);
        }
        nums[val-1]=-nums[val-1];
       } 
       return duplicate;
    }
}