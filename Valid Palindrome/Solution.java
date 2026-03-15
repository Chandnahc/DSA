class Solution {
    public boolean isPalindrome(String s) {
        String rev = "";
        int l = s.length();
        for(int i=l-1;i>=0;i--){
            if(Character.isLetterOrDigit(s.charAt(i))){
                rev += s.charAt(i);
            }
        }
        rev = rev.toLowerCase();
        String s1 = new StringBuilder(rev).reverse().toString();
        return s1.equals(rev);
    }
}