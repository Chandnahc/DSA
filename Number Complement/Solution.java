class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        int l = s.length();
        String s1 = "";
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='1'){
                s1 += "0";
            }else{
                s1 += "1";
            }
        }
        return Integer.valueOf(s1,2);
    }
}