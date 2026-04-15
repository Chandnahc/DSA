class Solution {
    public int hammingDistance(int x, int y) {
        String xs = Integer.toBinaryString(x);
        String ys = Integer.toBinaryString(y);
        int i = xs.length()-1;
        int j = ys.length()-1;
        int count = 0;
        while(i>=0 || j>=0){
            if(j<0){
                if(xs.charAt(i)=='1'){
                    count++;
                }
                i--;
                continue;
            }
            if(i<0){
                if(ys.charAt(j)=='1'){
                    count++;
                }
                j--;
                continue;
            }
            if(xs.charAt(i)!=ys.charAt(j)){
                count++;
            }
            i--;
            j--;
        }
        return count;
    }
}