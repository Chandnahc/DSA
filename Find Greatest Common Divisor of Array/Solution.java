class Solution {
    public int findGCD(int[] nums) {
        int maxNum = 0;
        int minNum = 1001;
        for(int i:nums){
            if(i>maxNum) maxNum = i;
            if(i<minNum) minNum = i;
        }
        return gcd(minNum,maxNum);
    }

    private int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
}