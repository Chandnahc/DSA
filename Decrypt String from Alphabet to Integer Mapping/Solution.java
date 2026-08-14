class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder("");
        int n = s.length();
        for(int i=0;i<n;i++){
            if(i<n-2 && s.charAt(i+2)=='#'){
                int temp = Integer.valueOf(s.substring(i,i+2))-1;
                sb.append((char)('a' + temp));
                i = i+2;
            }else{
                int temp = Integer.valueOf(s.charAt(i) - '0')-1;
                sb.append((char)('a' + temp));
            }
        }
        return sb.toString();
    }
}