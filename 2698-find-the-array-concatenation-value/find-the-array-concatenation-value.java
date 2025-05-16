class Solution {
    public long findTheArrayConcVal(int[] nums) {
       long count=0;
       int p1=0;
       int p2=nums.length-1;
       while(p1<=p2){
        if(p1==p2){
            count+=nums[p1];
        }
        else{
            String concat = String.valueOf(nums[p1]) + String.valueOf(nums[p2]);
                count += Long.parseLong(concat);
        }
        p1++;
        p2--;
       } 
       return count;
    }
}