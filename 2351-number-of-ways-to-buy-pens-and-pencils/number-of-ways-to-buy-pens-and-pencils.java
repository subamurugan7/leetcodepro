class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long way=0;
        for(int pen=0;pen*cost1<=total;pen++){
            int remainder=total-pen*cost1;
            way+=(remainder/cost2)+1;
        }
        return way;
    }
}