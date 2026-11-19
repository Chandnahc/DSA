class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        char curr = s.charAt(0);
        sb.append(curr);
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
            if(c==curr){
                if(count<2) {
                    count++;
                    sb.append(c);
                }
            }else{
                sb.append(c);
                curr = c;
                count = 1;
            }
        }
        return sb.toString();
    }
}