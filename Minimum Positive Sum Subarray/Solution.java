class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        int size = l;
        int[] arr = nums.stream().mapToInt(Integer::intValue).toArray();
        while(r>=size){
            int currSum = 0;
            for(int i=0;i<size;i++){
                currSum += arr[i];
            }
            int left = 0;
            int right = size;
            if(currSum>0) min = Math.min(min,currSum);
            while(right<arr.length){
                currSum += arr[right]-arr[left];
                if(currSum>0) min = Math.min(min,currSum);
                right++;
                left++;
            }
            size++;
        }
        return min==Integer.MAX_VALUE ? -1:min;
    }
}