class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
     int div=0;
     int mod=0;
     ArrayList<Integer> list=new ArrayList<>();
     for(int i=left;i<=right;i++){
       if(isSelfDividing(i)){
        list.add(i);
       }
     }   
     return list;
    }
    private boolean isSelfDividing(int num){
        int org=num;
        while(num>0){
            int digit=num%10;
            if(digit==0||org%digit!=0){
                return false;
            }
            num=num/10;
        }
        return true;
    }
}