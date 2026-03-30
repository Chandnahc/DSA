class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] evenItem = new char[26];
        char[] oddItem = new char[26];
        for(int i=0;i<4;i++){
            if(i%2==0){
                evenItem[s1.charAt(i)-'a']++;
            }else{
                oddItem[s1.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<4;i++){
            if(i%2==0){
                evenItem[s2.charAt(i)-'a']--;
            }else{
                oddItem[s2.charAt(i)-'a']--;
            }
        }

        for(int i=0;i<26;i++){
            if(evenItem[i]!=0 || oddItem[i]!=0){
                return false;
            }
        }

        return true;

    }
}