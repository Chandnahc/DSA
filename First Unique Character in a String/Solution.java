class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        int l = s.length();
        for(int i=0;i<l;i++){
            freq[s.charAt(i)-'a']++;
        }
        int minIndex = l;
        for(int i=0;i<26;i++){
            if(freq[i]==1){
                int idx = s.indexOf('a'+i);
                if(idx<minIndex){
                    minIndex = idx;
                }
            }
        }
        return minIndex==l?-1:minIndex;
    }
}