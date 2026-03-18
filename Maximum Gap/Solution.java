class Solution {
    public int maximumGap(int[] nums) {
        int l = nums.length;
        if(l==1){
            return 0;
        }
        int maxDiff = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<l-1;i++){
            if(maxDiff<nums[i+1]-nums[i]){
                maxDiff = nums[i+1] - nums[i];
            }
        }
        return maxDiff;
    }
}