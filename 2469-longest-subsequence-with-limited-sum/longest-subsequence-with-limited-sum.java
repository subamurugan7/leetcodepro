class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length;
       int[] ans=new int[queries.length];
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        for(int i=0;i<queries.length;i++){
            int q=queries[i];
            int count=0;
            while(count<n&&nums[count]<=q){
                count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}