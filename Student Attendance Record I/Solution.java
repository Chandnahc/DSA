class Solution {
    public boolean checkRecord(String s) {
        int absIdx = s.indexOf('A');
        if(absIdx != -1){
            if(s.indexOf('A',absIdx+1)!=-1){
                return false;
            }
        }
        if(s.indexOf("LLL")!=-1){
            return false;
        }
        return true;
    }
}