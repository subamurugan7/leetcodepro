class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for(int num : piles){
            if(num > right){
                right = num;
            }
        }

        int ans = right;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(istrue(piles, h, mid)){
                ans = mid;
                right = mid - 1; // try smaller speed
            } else {
                left = mid + 1;  // speed too small
            }
        }

        return ans;
    }

    private boolean istrue(int[] piles, int h, int speed){
        int sum = 0;
        for(int num : piles){
            sum += (num + speed - 1) / speed; // ceil division
            if(sum > h) return false;          // early exit
        }
        return true;
    }
}
