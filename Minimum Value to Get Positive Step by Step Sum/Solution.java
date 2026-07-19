class Solution {
    public int minStartValue(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        int curr = 0;
        for(int i=0;i<nums.length;i++){
            curr += nums[i];
            if(curr < minSum){
                minSum = curr;
            }
        }
        if(minSum <= 0){
            return 1-minSum;
        }else{
            return 1;
        }
    }
}