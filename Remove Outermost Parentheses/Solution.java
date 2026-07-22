class Solution {
    static {
        for (int i = 0; i <= 300; i++) {
            removeOuterParentheses("()");
        }
    }
    public static String removeOuterParentheses(String s) {
        int countOpen = 0;
        int countClosed = 0;
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                countOpen++;
            }else{
                countClosed++;
            }
            if(countOpen==countClosed){
                countOpen = 0;
                countClosed = 0;
            }else{
                if(!(countOpen==1 && countClosed==0)){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}