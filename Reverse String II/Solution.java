class Solution {
    public String reverseStr(String s, int k) {
        String res = "";
        int i = 0;
        int l = s.length();
        while((i+2*k)<=l){
            String s1 = s.substring(i,i+k);
            String s2 = s.substring(i+k,i+2*k);
            res += (new StringBuilder(s1)).reverse().toString() + s2;
            i += 2*k;
        }
        if(i+k < l){
            String s1 = s.substring(i,i+k);
            String s2 = s.substring(i+k,l);
            res += (new StringBuilder(s1)).reverse().toString() + s2;
        }else{
            String s1 = s.substring(i,l);
            res += (new StringBuilder(s1).reverse().toString());
        }
        return res;
    }
}