class Solution {
    public int maxScore(String s) {
        int countOne = 0;
        for(char c:s.toCharArray()){
            if(c=='1'){
                countOne++;
            }
        }
        int currZero = 0;
        int maxScore = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                currZero++;
            }else{
                countOne--;
            }
            if((currZero + countOne) > maxScore) maxScore = currZero + countOne;
        }
        return maxScore;
    }
}