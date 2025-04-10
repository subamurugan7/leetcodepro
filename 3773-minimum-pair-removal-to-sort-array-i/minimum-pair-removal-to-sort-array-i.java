class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        int operation=0;
        while(!issorted(list)){
            int minsum=Integer.MAX_VALUE;
            int index=0;
            for(int i=0;i<list.size()-1;i++){
                int sum=list.get(i)+list.get(i+1);
                if(sum<minsum){
                    minsum=sum;
                    index=i;
                }
            }
            int merged=list.get(index)+list.get(index+1);
            list.remove(index+1);
            list.set(index,merged);
            operation++;
        }
        return operation;
    }
    private boolean issorted(List<Integer>list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                return false;
            }
        }
        return true;
    }
}