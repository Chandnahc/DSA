class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        boolean[] freq = new boolean[26];
        for(char i:brokenLetters.toCharArray()) freq[i-'a'] = true;
        int ans = 0;
        for(String i:arr){
            boolean flag = true;
            for(char c:i.toCharArray()){
                if(freq[c-'a']){
                    flag = false;
                    break;
                }
            }
            if(flag) ans++;
        }
        return ans;
    }
}