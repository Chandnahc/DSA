class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        int n = num;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        return sum==n;
        
    }
}