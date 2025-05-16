class Solution {
    public int longestMountain(int[] arr) {
      int maxLen = 0;
      for(int i=1;i<arr.length-1;i++){
          if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
            int left=i;
            int right=i;
            while(left>0&&arr[left]>arr[left-1]){
                left--;
            }
            while(right<arr.length-1&&arr[right]>arr[right+1]){
                right++;
            }
            int currLen = right - left + 1;
            maxLen = Math.max(maxLen, currLen);
            i = right;
          }
      }
      return maxLen;  
    }
}