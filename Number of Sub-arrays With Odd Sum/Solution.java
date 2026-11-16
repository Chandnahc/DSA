class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = (int) 1e9 + 7;
        int[] cnt = {1, 0};
        int ans = 0, s = 0;

        for (int x : arr) {
            s += x;
            ans = (ans + cnt[s & 1 ^ 1]) % MOD;
            cnt[s & 1]++;
        }
        return ans;
    }
}