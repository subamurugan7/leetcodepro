class Solution {
    public int dayOfYear(String date) {
        // Split the date string into year, month, and day
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        // Days in each month for a non-leap year
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Check if it's a leap year, and update February days
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        // Sum the days of all previous months
        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }

        // Add the current day of the current month
        dayOfYear += day;

        return dayOfYear;
    }

    // Helper method to check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
