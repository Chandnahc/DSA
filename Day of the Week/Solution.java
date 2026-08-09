class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        // int temp = year > 1971 ? year - 1972 : 0;
        int totalDays = 0;
        // totalDays = temp/4;
        totalDays += (year - 1971)*365;
        for(int i=1971;i<year;i++){
            if(isLeap(i)){
                totalDays++;
            }
        }
        int[] prefix = {0,31,61,92,122,153,183,214,245,275,306,336};
        totalDays += prefix[month-1];
        if(month>2){
            if(isLeap(year)){
                totalDays -= 1;
            }else{
                totalDays -= 2;
            }

        }
        totalDays += day;
        String[] arr = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        return arr[(totalDays+6)%7];
    }

     private boolean isLeap(int year) {
        return year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0);
    }
}