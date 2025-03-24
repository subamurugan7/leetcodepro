class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0,sumB=0;
        for(int candy:aliceSizes) sumA+=candy;
        for(int candy:bobSizes) sumB+=candy;
        int delta=(sumB-sumA)/2;
        HashSet<Integer> set=new HashSet<>();
        for(int candy:bobSizes){
            set.add(candy);
        }
        for(int candy:aliceSizes){
            int req=candy+delta;
            if(set.contains(req)){
                return new int[]{candy,req};
            }        
        }
        return  new int[]{};
    }
}