class Solution {
    public long sumAndMultiply(int n) {
        int x = 0;
        int sum = 0;
        while(n!=0){
            int tmp = n%10;
            if(tmp!=0){
                x = x*10 + tmp;
                sum += tmp;
            }
            n = n/10;
        }
        int digit = 0;
        while(x!=0){
            digit = digit*10 + x%10;
            x = x/10;
        }
        return (long) digit * sum;
    }
}