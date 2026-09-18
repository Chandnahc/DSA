class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int step = 3;
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        int sum = prefix[n-1];
        // System.out.println(sum);
        while(step <= n){
            for(int i = step-1;i<n;i++){
                if(i-step >= 0){
                    sum -= prefix[i-step];
                }
                sum += prefix[i];
                // System.out.println(sum);
            }
            step += 2;
        }
        return sum;

    }

    // private int giveSum(int[] arr, int l, int r){
    //     int count = 0;
    //     for(int i=l;i<=r;i++){
    //         count += arr[i];
    //     }
    //     return count;
    // }
}