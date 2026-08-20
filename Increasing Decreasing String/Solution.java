class Solution {
    public String sortString(String s) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        StringBuilder res = new StringBuilder("");
        int i = 0;
        while(res.length()!=s.length()){
            if(i==0 || i==-1){
                i=0;
                for(;i<26;i++){
                    if(freq[i]>0){
                        res.append((char)('a'+i));
                        freq[i]--;
                    }
                }
            }else{
                i=25;
                for(;i>=0;i--){
                    if(freq[i]>0){
                        res.append((char)('a'+i));
                        freq[i]--;
                    }
                }
            }
        }

        return res.toString();
    }
}