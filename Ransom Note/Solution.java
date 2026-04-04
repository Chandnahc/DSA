class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        int ransomLen = ransomNote.length();
        int magazineLen = magazine.length();
        for(int i=0;i<ransomLen;i++){
            freq[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0;i<magazineLen;i++){
            if(freq[magazine.charAt(i)-'a']!=0){
                freq[magazine.charAt(i)-'a']--;
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}