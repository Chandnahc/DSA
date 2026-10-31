class Solution {
    public int sumBase(int n, int k) {
        int ans = 0;
        while(n!=0){
            ans = ans*10 + n%k;
            n /= k;
        }

        n = 0;
        while(ans!=0){
            n += ans%10;
            ans /= 10;
        }
        return n;
    }
}