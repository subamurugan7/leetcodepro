class Solution {
    public int[][] transpose(int[][] matrix) {
       int n=matrix.length;
       int m=matrix[0].length;
       List<List<Integer>> ans=new ArrayList<>();
       for(int j=0;j<m;j++){
        List<Integer> row=new ArrayList<>();
        for(int i=0;i<n;i++){
            row.add(matrix[i][j]);
        }
         ans.add(row);
       } 
       int r=ans.size();
       int c=ans.get(0).size();
       int[][] result=new int[r][c];
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            result[i][j]=ans.get(i).get(j);
        }
       }
       return result;
    }
}