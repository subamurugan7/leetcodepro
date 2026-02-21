class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     Arrays.sort(nums1);
     Arrays.sort(nums2);
      ArrayList<Integer> nums=new ArrayList<>();
      int i=0;
      int j=0;
      while(i<nums1.length&&j<nums2.length){
        if(nums1[i]==nums2[j]){
            nums.add(nums1[i]);
            i++;
            j++;
        }
        else if(nums1[i]>nums2[j]){
            j++;
        }
        else{
            i++;
        }
      }  
      int[] ans=new int[nums.size()];
      int k=0;
      for(int num:nums){
        ans[k++]=num;
      }
      return ans;
    }
}