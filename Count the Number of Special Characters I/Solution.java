class Solution {
    public int numberOfSpecialChars(String word) {
        int[] freq = new int[58];
        int l = word.length();
        for(int i=0;i<l;i++){
            freq[word.charAt(i)-'A']++;
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(freq[i]!=0 && freq[i+32]!=0){
                count++;
            }
        }
        return count;
    }
}