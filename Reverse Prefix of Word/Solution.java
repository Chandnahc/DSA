class Solution {
    public String reversePrefix(String word, char ch) {
        char[] carr = word.toCharArray();
        int idx = -1;
        for(int i=0;i<carr.length;i++){
            if(carr[i]==ch) {
                idx = i;
                break;
            }
        }
        if(idx==-1) return word;
        for(int i=0;i<=idx/2;i++){
            char c = carr[i];
            carr[i] = carr[idx-i];
            carr[idx-i] = c;
        }
        return new String(carr);
    }
}