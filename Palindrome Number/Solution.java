class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0){
            int result = 0;
            int n = x;
            while(n>0){
                result = result*10 + n%10;
                n = n/10;
            };
            return result == x;
        }else{
            return false;
        }
    }
}