class Solution {
    public int countPairs(List<Integer> nums, int target) {
       /*int count=0;
       for(int i=0;i<nums.size()-1;i++){
        for(int j=i+1;j<nums.size();j++){
          int sum=nums.get(i)+nums.get(j);
          if(sum<target){
            count++;
          }
        }
       }
       return count; 
       */
       Collections.sort(nums);
       int start=0;
       int count=0;
       int end=nums.size()-1;
       while(start<end){
        if(nums.get(start)+nums.get(end)<target){
            count+=  end-start ;
            start++;
        }
        else{
        end--;
        }
       }
       return count;
    }
}