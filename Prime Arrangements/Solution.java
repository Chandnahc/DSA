class Solution {
    public int numPrimeArrangements(int n) {
        int count = 0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)) count++;
        }
        long res = 1;
        long mod = 1000000007;
        for(int i=count;i>=1;i--){
            res = (res*i)%mod;
        }
        for(int i=n-count;i>=1;i--){
            res = (res*i)%mod;
        }
        return (int) res;
    }

    private boolean isPrime(int n){
        for(int i=2;i*i <= n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}