class Solution {
    public int[] searchRange(int[] nums, int target) {
       int first=findfirst(nums,target);
       int last=findlast(nums,target);
       return new int[]{first,last};
    }
    private int findfirst(int[] nums,int target){
        int s=0,e=nums.length-1,first=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                first=m;
                e=m-1;
            }else if(nums[m]<target){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return first;
    }
    private int findlast(int[] nums,int target){
        int s=0,e=nums.length-1,last=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                last=m;
                s=m+1;
            }else if(nums[m]<target){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return last;
    }
}