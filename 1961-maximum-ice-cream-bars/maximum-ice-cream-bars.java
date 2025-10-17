class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        int val=0;
        for(int i=0;i<costs.length;i++){
         val+=costs[i];
         if(val>coins){
            return count;
         }
         count++;
        }
        return count;
    }
}