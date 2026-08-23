class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = 0;
        for(int i:nums){
            sum += i;
        }
        Arrays.sort(nums);
        List<Integer> l = new ArrayList<>();
        int currentSum = 0;
        for(int i=nums.length-1;i>=0;i--){
            if(currentSum > (sum-currentSum)){
                return l;
            }else{
                currentSum += nums[i];
                l.add(nums[i]);
            }
        }
        return l;
    }
}