class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        int n1 = flowerbed.length;
        for(int i=0;i<n1;i++){
            if(flowerbed[i]==0){
                if(i==0){
                    if(n1>1){
                        if(flowerbed[1]==0){
                            flowerbed[i] = 1;
                            if(--n == 0) return true;
                        }
                        continue;
                    }
                    return n==1;
                }else if(i==n1-1){
                    if(flowerbed[n1-2]==0){
                        return --n == 0;
                    }
                }else{
                    if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                        flowerbed[i] = 1;
                        if(--n == 0) return true;
                    }
                }
            }else{
                i++;
            }
        }
        return false;
    }
}