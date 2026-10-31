class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] freq = new boolean[26];
        for(char c:sentence.toCharArray()){
            freq[c-'a'] = true;
        }
        boolean ans=true;
        for(boolean i:freq){
            ans = ans && i;
            if(!ans) return ans;
        }
        return true;
    }
}