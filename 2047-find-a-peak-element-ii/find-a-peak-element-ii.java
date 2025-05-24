class Solution {
    public int[] findPeakGrid(int[][] mat) {
       int max=0;
       int[] result = new int[2];
       for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            if(max<mat[i][j]){
                max=mat[i][j];
                result[0] = i;
                result[1] = j;
            }
        }
       } 
       return  result;
    }
}