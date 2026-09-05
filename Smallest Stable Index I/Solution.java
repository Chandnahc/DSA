class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] minArray = new int[nums.length];
        int min = nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            min = Math.min(min,nums[i]);
            minArray[i] = min;
        }
        int minAns = nums[0]-minArray[0];
        if(minAns <= k) return 0;
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            if((max-minArray[i])<=k) return i;
        }
        return -1;
    }
}