class Solution {
    public boolean isGood(int[] nums) {
        int[] freq = new int[201];
        int max = nums[0];
        for(int i:nums){
            if(i>max) max = i;
            if(freq[i]==1 && i!=max) return false;
            freq[i]++;
            // if(freq[i]>1) return false;
        }
        if(freq[max]!=2) return false;
        for(int i=max-1;i>0;i--){
            if(freq[i]!=1) return false;
        }
        return true;
    }
}