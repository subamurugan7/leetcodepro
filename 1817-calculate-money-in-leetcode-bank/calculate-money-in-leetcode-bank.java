class Solution {
    public int totalMoney(int n) {
        int weekcount=n/7;
        int remainingdays=n%7;
        int total=((weekcount*(weekcount-1))/2)*7;
        total+=weekcount*28;
        total+=((remainingdays*(remainingdays+1))/2)+(weekcount*remainingdays);
        return total;
    }
}