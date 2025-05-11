class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
      List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < matrix.length; i++) {
            int minRowValue = Integer.MAX_VALUE;
            int minRowIndex = -1;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minRowValue) {
                    minRowValue = matrix[i][j];
                    minRowIndex = j;
                }
            }
            boolean isLucky = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minRowIndex] > minRowValue) {
                    isLucky = false;
                    break;
                }
            }
            
            if (isLucky) {
                ans.add(minRowValue);
            }
        }
        
        return ans;
    }
}