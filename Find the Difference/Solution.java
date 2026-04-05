class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];
        int tl = t.length();
        int sl = s.length();
        for(int i=0;i<tl;i++){
            freq[t.charAt(i)-'a']++;
        }
        for(int i=0;i<sl;i++){
            freq[s.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]==1){
                return (char)('a'+i);
            }
        }
        return 'a';
    }
}