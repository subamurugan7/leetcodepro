class Solution {
    public String convertDateToBinary(String date) {
        String[] arr = date.split("-");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            result.append(toBinary(num));

            if (i < arr.length - 1) {
                result.append("-");
            }
        }
        return result.toString();
    }

    // Manual decimal → binary (NO reverse)
    private String toBinary(int num) {
        if (num == 0) return "0";

        String binary = "";

        while (num > 0) {
            int rem = num % 2;
            binary = rem + binary;   // manual prepend
            num = num / 2;
        }
        return binary;
    }
}
