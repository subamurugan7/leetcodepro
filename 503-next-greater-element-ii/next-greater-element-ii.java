class Solution {
    public int[] nextGreaterElements(int[] nums) {
      int[] result=new int[nums.length];
      int n=nums.length;
      for(int i=0;i<nums.length;i++){
        result[i]=-1;
        int j=(i+1)%n;
        while(j!=i){
           if(nums[i]<nums[j]){
            result[i]=nums[j];
            break;
           }
           j=(j + 1) % n;
        }
      } 
      return result; 
    }
}