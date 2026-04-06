class Solution {
    public boolean judgeCircle(String moves) {
        int upDownFreq = 0;
        int leftRightFreq = 0;
        int l = moves.length();
        for(int i=0;i<l;i++){
            switch(moves.charAt(i)){
                case 'U': upDownFreq++; break;
                case 'D': upDownFreq--; break;
                case 'R': leftRightFreq++; break;
                case 'L': leftRightFreq--; break;
                default : break;
            }
        }
        return upDownFreq == 0 && leftRightFreq == 0;
    }
}