class Solution {
    public int getMaximumGenerated(int n) {
        // if(n==0) return 0;
        // return n%2==0 ? generator(n-1) : generator(n);

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int max = 0;
        for (int i = 0; i <= n; i++) {
            max = Math.max(stern(i,dp),max);
        }
        return max;
    }

    private int generator(int n){
        if(n==0 || n==1) return n;
        int rem = n%2;
        int quot = n/2;
        // if(rem==0){
        //     return generator(quot);
        // }else{
        //     return generator(quot) + generator(quot+1);
        // }
        return rem==0 ? generator(quot) : generator(quot)+generator(quot+1);
    }

    static int stern(int n, int[] dp) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        if (dp[n] != -1)
            return dp[n];

        if (n % 2 == 0) {
            dp[n] = stern(n / 2, dp);
        } else {
            int k = n / 2;
            dp[n] = stern(k, dp) + stern(k + 1, dp);
        }

        return dp[n];
    }
}