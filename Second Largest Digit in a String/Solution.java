class Solution {
    public int secondHighest(String s) {
        int max = -1;
        int secMax = -1;
        for(char c:s.toCharArray()){
            if(c>='a' && c<='z'){
                continue;
            }else{
                int curr = (int)(c-'0');
                if(curr > max){
                    secMax = max;
                    max = curr;
                }else if(curr > secMax && curr<max){
                    secMax = curr;
                }
            }
        }
        return secMax == max ? -1:secMax;
    }
}