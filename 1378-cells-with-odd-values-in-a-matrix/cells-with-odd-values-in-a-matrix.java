class Solution {
    public int oddCells(int m, int n, int[][] indices) {
      int[] rowcount=new int[m];
      int[] colcount=new int[n];
      for(int[] index:indices){
        rowcount[index[0]]++;
        colcount[index[1]]++;
      }  
      int oddrows=0,oddcols=0;
      for(int row:rowcount){
        if(row%2==1) oddrows++;
      }
       for(int col:colcount){
        if(col%2==1) oddcols++;
      }
      return (oddrows*(n-oddcols))+(oddcols*(m-oddrows));
      
    }
}