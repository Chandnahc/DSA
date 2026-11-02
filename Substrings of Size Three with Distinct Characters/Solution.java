class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3) return 0;
        int l = 0;
        int r = 2;
        int ans = 0;
        char[] ch = s.toCharArray();
        while(r<s.length()){
            if(ch[l]!=ch[l+1] && ch[l]!=ch[r] && ch[l+1]!=ch[r]){
                ans++;
            }
            l++;
            r++;
        }
        return ans;
    }
}