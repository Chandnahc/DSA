class Solution {
    public int removePalindromeSub(String s) {
        if (s.length() == 0) {
            return 0;
        }

        if (checkPalindrome(s)) {
            return 1;
        }

        return 2;
    }

    public boolean checkPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}