class Solution {
    public String addBinary(String a, String b) {
        int al = a.length();
        int bl = b.length();
        String c = "";
        int carryValue = 0;;
        int i=0;
        int j=0;
        while(i<al || j<bl){
            int sum = carryValue;

            if (i < al ) sum += a.charAt(al - 1 - i++) - '0';
            if (j < bl ) sum += b.charAt(bl - 1 - j++) - '0';

            c = sum%2 + c;
            carryValue = sum/2;
        }
        if(carryValue == 1){
            c = "1" + c;
        }
        return c;
    }
}