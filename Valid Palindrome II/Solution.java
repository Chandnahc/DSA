class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
                continue;
            }else{
                String s1 = (new StringBuffer(s.substring(i+1,j+1))).toString();
                String s2 = (new StringBuffer(s.substring(i,j))).toString();
                String rev1 = (new StringBuffer(s1)).reverse().toString();
                String rev2 = (new StringBuffer(s2)).reverse().toString();
                if(s1.equals(rev1) || s2.equals(rev2)){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}