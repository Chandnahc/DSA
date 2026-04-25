class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        String movesL = moves.replace('_','L');
        String movesR = moves.replace('_','R');
        int n = moves.length();
        int sumL = 0;
        int sumR = 0;
        for(int i=0;i<n;i++){
            if(movesL.charAt(i)=='L'){
                sumL++;
            }else if(movesL.charAt(i)=='R'){
                sumL--;
            }
            if(movesR.charAt(i)=='R'){
                sumR++;
            }else if(movesR.charAt(i)=='L'){
                sumR--;
            }
        }
        return Math.max(sumL,sumR);

    }
}