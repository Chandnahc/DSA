class Solution {
    public int specialArray(int[] nums) {
        int[] freq = new int[1001];
        for(int i:nums){
            freq[i]++;
        }
        int count = 0;
        for(int i=1000;i>0;i--){
            while(freq[i]>0){
                count++;
                freq[i]--;
                if(count == i && freq[i]==0) return i;
            }
            if(count == i) return i;
        }
        return -1;
    }
}