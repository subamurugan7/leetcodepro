class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m=matrix.length;
        int n=matrix[0].length;
        int p=m*n;
       int[] arr=new int[p];
       int l=0;
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            arr[l++]=matrix[i][j];
        }
       } 
       Arrays.sort(arr);
       return arr[k-1];
    }
}