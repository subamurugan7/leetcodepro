class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       int count=0;
       for(int i=0;i<arr.length;i++){
        int num=0;
        for(int j=i;j<arr.length;j++){
            num+=arr[j];
            if((j-i+1)%2==1){
                count+=num;
                System.out.println(count);
            }
        }
       }  
       return count;
    }
}