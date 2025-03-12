class Solution {
    public int findNumbers(int[] nums) {
     int[] ans=new int[nums.length];
     int count=0;
     for(int i=0;i<nums.length;i++){
        int digit=0;
        int val=nums[i];
        while(val>0){
            val=val/10;
            digit=digit+1;
        }
        if(digit%2==0){
            count=count+1;
        }
     }
     return count;
    }
}