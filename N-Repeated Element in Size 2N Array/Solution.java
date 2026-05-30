class Solution {
    public int repeatedNTimes(int[] nums) {
        int[] freq = new int[10001];
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]!=0){
                return nums[i];
            }
            freq[nums[i]]++;
        }
        return -1;
    }
}