class Solution {
    public int diagonalSum(int[][] mat) {
     int count=0;
     for(int i=0;i<mat.length;i++){
       int j=i;
       int k=mat[i].length-1-i;
       if(j!=k){
         count=count+mat[i][j];
         count=count+mat[i][k];
       }
       else{
        count=count+mat[i][j];
       }
     }
     return count;
    }
}