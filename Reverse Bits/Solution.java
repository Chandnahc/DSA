class Solution {
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        int zeros = 32 - s.length();
        for(int i=0;i<zeros;i++){
            s = "0"+s;
        }
        return Integer.valueOf(new StringBuilder(s).reverse().toString(),2);
    }
}