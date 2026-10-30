class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder("");
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                sb.append(ch[i]);
            }else{
                char c = (char)(ch[i-1] + (ch[i]-'0'));
                sb.append(c);
            }
        }
        return sb.toString();
    }
}