class Solution {
    public int maximumLengthSubstring(String s) {
        int start = 0;
        int longestLen = 0;
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(freq[c-'a']==2){
                int temp = s.indexOf(c,start);
                while(start<temp+1){
                    freq[s.charAt(start++)-'a']--;
                }
                freq[c-'a']++;
            }else{
                freq[c-'a']++;
                if((i-start)>longestLen){
                    longestLen = i-start;
                }
            }
        }
        return longestLen+1;
    }
}