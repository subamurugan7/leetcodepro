class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int val=0;
            for(int j=0;j<accounts[i].length;j++){
                val=accounts[i][j]+val;
            }
            max=Math.max(max,val); 
        }
        return max;
    }
}