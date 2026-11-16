class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        int max = 0;
        for(char i:s.toCharArray()){
            freq[i-'a']++;
            max = Math.max(max,freq[i-'a']);
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0 && freq[i]!=max) return false;
        }
        return true;
    }
}