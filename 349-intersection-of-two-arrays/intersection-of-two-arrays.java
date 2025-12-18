class Solution {
    public int[] intersection(int[] a, int[] b) {
        Set<Integer> set=new HashSet<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        int i=0,j=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                set.add(a[i]);
                i++;
                j++;
            }
        }
        int[] ans=new int[set.size()];
        int c=0;
        for(int num:set){
            ans[c++]=num;
        }
        return ans;  
    }
}