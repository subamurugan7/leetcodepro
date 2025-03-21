class Solution {
    public int countNegatives(int[][] grid) {
       int count=0;
       for(int i=0;i<grid.length;i++){
        int s=0,e=grid[i].length;
        while(s<e){
            int m=s+(e-s)/2;
            if(grid[i][m]<0){
                e=m;
            }
            else{
                s=m+1;
            }
        }
        count=count+(grid[i].length-s);
       } 
       return count;
    }
}