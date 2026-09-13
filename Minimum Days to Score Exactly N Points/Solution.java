class Solution {
    public int minDays(int n) {
        // int count = 0;
        // while(true){
        //     int temp = calculateDays(n);
        //     count += temp;
        //     n = n-((temp*(temp+1))/2);
        //     if(n!=0){ count++; }
        //     else break;
        // }
        // return count;


        // Greedy Solution won't work here

        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int p = 1;p<=n;p++){
            for(int i=1;i*(i+1)/2 <= p;i++){
                int strkP = i*(i+1)/2;
                if(dp[p-strkP] != Integer.MAX_VALUE){
                    dp[p] = Math.min(dp[p],dp[p-strkP]+i+1);
                }
            }
        }

        return dp[n]-1;
    }

    // private int calculateDays(int n){
    //     int count = 1;
    //     while(true){
    //         int temp = (count * (count+1))/2;
    //         if(temp>n) break;
    //         count++;
    //     }
    //     count--;
    //     return count;
    // }
}