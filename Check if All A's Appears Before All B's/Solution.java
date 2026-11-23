class Solution {
    public boolean checkString(String s) {
        int aidx = s.length()-1;
        int bidx = 0;
        for(char c:s.toCharArray()){
            if(c=='b') break;
            bidx++;
        }
        for(;aidx>=0;aidx--){
            if(s.charAt(aidx)=='a') break;
        }
        if(bidx==s.length() || aidx==-1){
            return true;
        }else{
            return aidx<bidx;
        }
    }
}