class Solution {
    public int bitwiseComplement(int n) {
        String m = Integer.toBinaryString(n);
        String o = "";
        int length = m.length();
        for(int i=0;i<length;i++){
            if(m.charAt(i)=='1'){
                o += "0";
            }else{
                o += "1";
            }
        }
        return Integer.parseInt(o,2);
    }
}