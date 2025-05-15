class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
    /*int p1=0;
    int p2=0;
    while(p1<nums1.length&&p2<nums2.length){
        if(nums1[p1]==nums2[p2]){
            return nums1[p1];
        }
        else if(nums1[p1]<nums2[p2]){
            p1++;
        }
        else{
            p2++;
        }
    } 
    return -1; 
    */
    for(int i=0;i<nums1.length;i++){
        if(binarysearch(nums2,nums1[i] )){
            return nums1[i];
        }
    }
    return -1;
    }
    private boolean binarysearch(int[] nums2,int target){
        int l=0;
        int r=nums2.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums2[m]==target){
                return true;
            }
            else if(nums2[m]>target){
                r=m-1;
            }
            else{
                l=m+1;
            }
           
        }
         return false;
    } 
}