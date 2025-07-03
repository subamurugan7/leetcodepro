class Solution {
    public int firstUniqChar(String s) {
     char[] arr=s.toCharArray();
     for(int i=0;i<arr.length;i++){
        boolean unique=true;
        for(int j=0;j<arr.length;j++){
            if(i!=j&&arr[i]==arr[j]){
                unique=false;
                break;
            }
        }
        if(unique==true){
            return i;
        }
     }   
     return -1;
    }
}