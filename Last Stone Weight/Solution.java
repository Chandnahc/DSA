class Solution {
    public int lastStoneWeight(int[] stones) {
        while(true){
            int max = 0;
            int secMax = 0;
            int maxIdx = -1;
            int secMaxIdx = -1;
            for(int i=0;i<stones.length;i++){
                if(stones[i]>max){
                    secMax = max;
                    secMaxIdx = maxIdx;
                    max = stones[i];
                    maxIdx = i;
                }else if(stones[i]>secMax){
                    secMax = stones[i];
                    secMaxIdx = i;
                }
            }
            if(secMax == 0){
                return max;
            }else{
                if(secMax == max){
                    stones[secMaxIdx] = 0;
                    stones[maxIdx] = 0;
                }else{
                    stones[secMaxIdx] = 0;
                    stones[maxIdx] = max - secMax;
                }
            }
        }
        // return 0;
    }
}