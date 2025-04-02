class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String[] ans=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            int k=arr[i].length()-1;
            int m=arr[i].charAt(k)-'0';
            ans[m-1]=arr[i].substring(0,k);
        }
        StringBuilder res=new StringBuilder();
        for(int j=0;j<ans.length;j++){
            res.append(ans[j]+" ");
        }
        return (res.toString()).trim();
    }
}