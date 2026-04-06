class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;
        for(char c:s.toCharArray()){
            int index = t.indexOf(c,idx);
            if(index == -1){
                return false;
            }
            idx = index+1;
        }
        return true;
    }
}