class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] freq = new int[101];
        for(int i:nums){
            freq[i]++;
        }
        int j=1;
        while(true){
            if(k*j <= 100){
                if(freq[k*j]==0){
                    return k*j;
                }else{
                    j++;
                }
            }else{
                break;
            }
        }
        return k*j;
    }
}