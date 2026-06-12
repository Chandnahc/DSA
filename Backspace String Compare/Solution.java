class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = "";
        String t1 = "";
        int i = s.length()-1;
        int hashcount = 0;
        while(i>=0){
            if(s.charAt(i)=='#'){
                hashcount++;
            }else{
                if(hashcount>0){
                    hashcount--;
                }else{
                    s1 = s.charAt(i) + s1;
                }
            }
            i--;
        }
        i = t.length()-1;
        hashcount = 0;
        while(i>=0){
            if(t.charAt(i)=='#'){
                hashcount++;
            }else{
                if(hashcount>0){
                    hashcount--;
                }else{
                    t1 = t.charAt(i) + t1;
                }
            }
            i--;
        }
        return s1.equals(t1);
    }
}