class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for(char c: chars.toCharArray()){
            freq[c-'a']++;
        }
        int res = 0;
        for(int i=0;i<words.length;i++){
            int curr = 0;
            int[] currFreq = new int[26];
            for(char c:words[i].toCharArray()){
                currFreq[c-'a']++;
            }
            for(int j=0;j<26;j++){
                if(currFreq[j]<=freq[j]){
                    curr += currFreq[j];
                }else{
                    curr = 0;
                    break;
                }
            }
            res += curr;
        }
        return res;
    }
}