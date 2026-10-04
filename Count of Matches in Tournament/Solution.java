class Solution {
    public int numberOfMatches(int n) {
        int count = 0;
        int carry = 0;
        // if(n%2==0){
            while(n!=1){
                if(n%2==1){
                    n-=1;
                    carry = 1;
                }else{
                    carry = 0;
                }
                count += n/2;
                n = n/2 + carry;
            }
            return count;
        // }
    }
}