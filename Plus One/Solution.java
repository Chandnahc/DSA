class Solution {
    public int[] plusOne(int[] digits) {
        String s = "";
        String s1 = "";
        int n = digits.length;
        for(int i=0;i<digits.length;i++){
            s += ""+digits[i];
        }
        int carryValue = 1;
        for(int i=n-1;i>=0;i--){
            int currentChar = Character.getNumericValue(s.charAt(i));
            if((currentChar+carryValue) > 9){
                s1 += ""+(currentChar+carryValue)%10;
                carryValue = 1;
            }else{
                s1 += "" + (Character.getNumericValue(s.charAt(i))+carryValue);
                carryValue = 0;
            }
        }
        if(carryValue == 1){
            s1 += "1";
        }
        int m = s1.length();
        int[] result = new int[m];
        int j = 0;
        for(int i=m-1;i>=0;i--){
            result[j++] = Character.getNumericValue(s1.charAt(i));
        }
        return result;
        
    }
}