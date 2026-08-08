class Solution {
    public int dayOfYear(String date) {
        String[] d = date.split("-");
        int year = Integer.valueOf(d[0]);
        int month = Integer.valueOf(d[1]);
        int day = Integer.valueOf(d[2]);
        int res = 0;
        switch(month){
            case 1: res = 0; break;
            case 2: res = 31; break;
            case 3: res = 61; break;
            case 4: res = 92; break;
            case 5: res = 122; break;
            case 6: res = 153; break;
            case 7: res = 183; break;
            case 8: res = 214; break;
            case 9: res = 245; break;
            case 10: res = 275; break;
            case 11: res = 306; break;
            case 12: res = 336; break;
            default: break;
        }

        if(month>2){
            if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){
                res -= 1;
            }else{
                res -= 2;
            }
        }

        return res+day;

    }
}