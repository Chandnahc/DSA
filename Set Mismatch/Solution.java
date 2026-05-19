class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int expectedSum = (n*(n+1))/2;
        int[] arr = new int[n];
        int totalSum = 0;
        int[] res = new int[2];
        for(int i=0;i<n;i++){
            arr[nums[i]-1]++;          
            totalSum += nums[i];
        }
        for(int i=0;i<n;i++){
            if(arr[i]==2){
                res[0] = i+1;
                res[1] = expectedSum - (totalSum - i - 1);
                return res;
            }
        }
        return res;
    }
}