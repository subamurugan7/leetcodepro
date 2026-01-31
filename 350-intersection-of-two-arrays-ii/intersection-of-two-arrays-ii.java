class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     sort(nums1);
     sort(nums2);  
     ArrayList<Integer> list=new ArrayList<>();
     int i=0,j=0;
     while(i<nums1.length&&j<nums2.length){
         if(nums1[i]<nums2[j]){
            i++;
         }
         else if(nums1[i]>nums2[j]){
            j++;
         }
         else{
            list.add(nums1[i]);
            i++;
            j++;
         }
     }  
     int[] ans=new int[list.size()];
     int m=0;
     for(int k:list){
        ans[m++]=k;
     }
     return ans;
       }
    private static void sort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}