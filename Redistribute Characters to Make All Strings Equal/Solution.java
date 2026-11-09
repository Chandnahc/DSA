class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];
        for(String i:words){
            for(char j:i.toCharArray()){
                freq[j-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i]%words.length!=0) return false;
        }
        return true;
    }
}