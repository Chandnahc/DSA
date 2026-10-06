class Solution {
    public int scoreOfParentheses(String s) {
        s = s.replaceAll("\\(\\)","1");
        System.out.print(s);
        int count = 0;
        int score = 0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
            }else if(c==')'){
                count--;
            }else{
                score += count==0 ? 1 : Math.pow(2,count);
            }
        }
        return score;
    }
}