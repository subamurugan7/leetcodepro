class Solution {
    public int addDigits(int num) {
    if(num<10){
        return num;
    }
    return (num - 1) % 9 + 1;
    }
}