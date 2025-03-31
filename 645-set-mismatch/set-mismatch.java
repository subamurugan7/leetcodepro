class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return new int[]{nums[index],index+1};
            }
        }
        return new int[]{-1,-1};
   /* int n=nums.length;
     int[] count =new int[n+1];
     int dup=-1,mis=-1;
     for(int num:nums){
        count[num]++;
     }
     for(int i=1;i<=n;i++){
        if(count[i]==2){
            dup=i;
        }
        else if(count[i]==0){
            mis=i;
        }
     }
     return new int[]{dup,mis};
     */
    }
    void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}