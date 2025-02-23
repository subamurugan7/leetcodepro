class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countk(nums,k)-countk(nums,k-1);
    }
    private static int countk(int[] nums,int k){ 
        int count=0;
        int i=0;
        for(int j=i;j<nums.length;j++){
            if(nums[j]%2!=0){
              k--;
            }
            while(k<0){
                 if(nums[i]%2!=0){
                     k++;
                 }
            i++;
            }
            count+=j-i+1;
        }
      return count;  
    }
}