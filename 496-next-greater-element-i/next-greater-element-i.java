class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(j<nums2.length&&nums1[i]!=nums2[j]){
                j++;
            }
            int nextgreat=-1;
            j++;
            while(j<nums2.length){
                if(nums1[i]<nums2[j]){
                    nextgreat=nums2[j];
                    break;
                }
                j++;
            }
            result[i]=nextgreat;
        }
        return result;
    }
}