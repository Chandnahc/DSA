class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;
        int l = s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}