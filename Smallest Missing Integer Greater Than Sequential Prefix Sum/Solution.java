class Solution {
    public int missingInteger(int[] nums) {
        int longestSeqPrefixSum = nums[0];
        // int currentSum = nums[0];
        // int longestPrefixLen = 0;
        // int start = 0;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]+1){
        //         currentSum += nums[i];
        //         if((i-start)>longestPrefixLen){
        //             longestPrefixLen = i-start;
        //             if(currentSum > longestSeqPrefixSum){
        //                 longestSeqPrefixSum = currentSum;
        //             }
        //         }
        //     }else{
        //         start = i;
        //         if(currentSum > longestSeqPrefixSum){
        //             longestSeqPrefixSum = currentSum;
        //         }
        //         currentSum = nums[i];
        //     }
        // }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                longestSeqPrefixSum += nums[i];
            }else{
                break;
            }
        }
        System.out.println(longestSeqPrefixSum);
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=longestSeqPrefixSum){
                if(longestSeqPrefixSum==nums[i]){
                    longestSeqPrefixSum++;
                }else{
                    return longestSeqPrefixSum;
                }
            }
        }
        return nums[nums.length-1]==longestSeqPrefixSum ? longestSeqPrefixSum+1 : longestSeqPrefixSum;
    }
}