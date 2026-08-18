class Solution {
    public int daysBetweenDates(String date1, String date2) {

        int[] prefix = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

        int year1 = (date1.charAt(0) - '0') * 1000 +
                    (date1.charAt(1) - '0') * 100 +
                    (date1.charAt(2) - '0') * 10 +
                    (date1.charAt(3) - '0');

        int month1 = (date1.charAt(5) - '0') * 10 +
                     (date1.charAt(6) - '0');

        int day1 = (date1.charAt(8) - '0') * 10 +
                   (date1.charAt(9) - '0');

        int year2 = (date2.charAt(0) - '0') * 1000 +
                    (date2.charAt(1) - '0') * 100 +
                    (date2.charAt(2) - '0') * 10 +
                    (date2.charAt(3) - '0');

        int month2 = (date2.charAt(5) - '0') * 10 +
                     (date2.charAt(6) - '0');

        int day2 = (date2.charAt(8) - '0') * 10 +
                   (date2.charAt(9) - '0');

        int days1 = year1 * 365 + prefix[month1 - 1] + day1;
        int days2 = year2 * 365 + prefix[month2 - 1] + day2;

        // Add leap days before the given year
        days1 += countLeapYears(year1 - 1);

        // If date is after February, include current year's leap day
        if (month1 > 2 && isLeapYear(year1)) {
            days1++;
        }

        days2 += countLeapYears(year2 - 1);

        if (month2 > 2 && isLeapYear(year2)) {
            days2++;
        }

        return Math.abs(days1 - days2);
    }

    private boolean isLeapYear(int year) {
        return year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0);
    }

    private int countLeapYears(int year) {
        return year / 4 - year / 100 + year / 400;
    }
}