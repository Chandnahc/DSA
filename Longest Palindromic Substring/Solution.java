class Solution {
    public String longestPalindrome(String s) {
        String maxLenStr = String.valueOf(s.charAt(0));
        for(int i=0;i<s.length();i++){
            for(int j=i+maxLenStr.length();j<s.length();j++){
                if(checkPalindrome(s.substring(i,j+1))){
                    if(maxLenStr.length()<j-i+1){
                        maxLenStr = s.substring(i,j+1);
                    }
                }
            }
        }
        return maxLenStr;
    }

    private boolean checkPalindrome(String s){
        int low = 0;
        int high = s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
}