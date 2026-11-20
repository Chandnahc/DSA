class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int itr = 0;
        for(String i:words){
            for(int j=0;j<i.length();j++){
                if(i.charAt(j)!=s.charAt(itr)) return false;
                itr++;
                if(itr==s.length()){
                    if(j==i.length()-1) return true;
                    else return false;
                }
            }
        }
        return false;
    }
}