class Solution {
    public boolean stoneGame(int[] piles) {
        // int low = 0;
        // int high = piles.length-1;
        // int aliceStones = 0;
        // int bobStones = 0;
        // boolean flag = true;
        // while(low<high){
        //     if(flag){
        //         if(piles[low]<=piles[high]){
        //             aliceStones += piles[high--];
        //         }else{
        //             aliceStones += piles[low++];
        //         }
        //     }else{
        //         if(piles[low]<=piles[high]){
        //             bobStones += piles[high--];
        //         }else{
        //             bobStones += piles[low++];
        //         }
        //     }
        //     flag = !flag;
        // }
        // return aliceStones > bobStones;
        // return winOrNot(piles, aliceStones, bobStones, low, high, flag);
        return true;
    }

    private boolean winOrNot(int[] piles, int aliceSum, int bobSum, int low, int high, boolean flag){
        if(low <= high){
            if(flag){
                return winOrNot(piles, aliceSum+piles[low], bobSum, low+1, high, !flag) ||
                    winOrNot(piles, aliceSum+piles[high], bobSum, low, high-1, !flag);
            }else{
                return winOrNot(piles, aliceSum, bobSum+piles[low], low+1, high, !flag) &&
                    winOrNot(piles, aliceSum, bobSum+piles[high], low, high-1, !flag);
            }
        }else{
            return aliceSum > bobSum;
        }
    }
}