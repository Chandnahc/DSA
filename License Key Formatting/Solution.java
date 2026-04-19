class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int l = s.length();
        int countAlphaNumeric = 0;
        String s1 = "";
        for(int i=l-1;i>=0;i--){
            if(s.charAt(i)=='-'){
                continue;
            }
            if(countAlphaNumeric<k){
                s1 = s.charAt(i) + s1;
                countAlphaNumeric++;
            }else{
                countAlphaNumeric = 1;
                s1 = s.charAt(i) + "-" + s1;
            }
        }
        return s1.toUpperCase();

    }
}