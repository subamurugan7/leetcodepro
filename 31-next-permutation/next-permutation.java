class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(nums[i]>=nums[j]){
               j--; 
            }
            swap(nums,i,j);
        }
        reverse (nums,i+1,n-1);
    }
    private  static void swap(int[] arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    } 
    private static void reverse(int[] arr1,int s,int e){
      while(s<e){
        swap(arr1,s,e);
        s++;
        e--;
      }
    } 
}