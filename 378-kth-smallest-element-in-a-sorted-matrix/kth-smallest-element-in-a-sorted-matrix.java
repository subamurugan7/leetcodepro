class Solution {
    public int kthSmallest(int[][] matrix, int k) {
       int n=matrix.length;
       int m=matrix[0].length;
       int length=m*n;
       int[] ans=new int[length];
       int index=0;
        for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
          ans[index]=matrix[i][j];
          index++;
        }
       } 
       Arrays.sort(ans);
       return ans[k-1];
    }
}