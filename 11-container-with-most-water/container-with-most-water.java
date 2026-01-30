class Solution {
    public int maxArea(int[] height) {
       int maximumsavewater=0;
       int start=0;
       int end=height.length-1;
       while(start<=end){
        int min=Math.min(height[start],height[end]);
        int index=end-start;
        int water=min*index;
        maximumsavewater=Math.max(maximumsavewater,water);
        if(height[start]<height[end]){
            start++;
        }
        else{
            end--;
        }
       } 
       return maximumsavewater;
    }
}