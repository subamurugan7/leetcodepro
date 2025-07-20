class Solution {
   public int findNthDigit(int n) {
    int digitLength = 1;
    long count = 9;
    int start = 1;
    while (n > digitLength * count) {
        n -= digitLength * count;
        digitLength++;
        count *= 10;
        start *= 10;
    }
    int number = start + (n - 1) / digitLength;
    String numStr = Integer.toString(number);
    return Character.getNumericValue(numStr.charAt((n - 1) % digitLength));
}

}