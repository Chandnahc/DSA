class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int start = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(start != -1){
                    max = Math.max(max,i-start);
                }
                start = -1;
            }else{
                if(start == -1){
                    start = i;
                }
            }
        }
        if(nums[nums.length-1] == 1 && start != -1){
            max = Math.max(max,nums.length-start);
        }
        return max;
    }
}