class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int min = 101;
        int count = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                if(k>0){
                    nums[i] = -nums[i];
                    k--;
                }
            }
            count += nums[i];
            if(min > nums[i]){
                min = nums[i];
            }

        }
        if(k>0 && k%2==1){
            count -= 2*min;
        }
        return count;
    }
}