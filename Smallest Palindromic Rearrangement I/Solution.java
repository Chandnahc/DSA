class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }

        StringBuilder sb = new StringBuilder("");
        int i;
        int lastOdd = -1;
        for(i=0;i<26;i++){
            if(freq[i]%2==1) {
                lastOdd = i;
                // continue;
            }
            int temp = freq[i]/2;
            while(temp>0){
                sb.append((char)(i+'a'));
                temp--;
            }
        }
        if(lastOdd==-1){
            sb.append(new StringBuilder(sb).reverse().toString());
        }else{
            String temp = new StringBuilder(sb).reverse().toString();
            // while(freq[lastOdd]>0){
                sb.append((char)(lastOdd+'a'));
                // freq[lastOdd]--;
            // }
            sb.append(temp);
        }
        return sb.toString();

    }
}