class Solution {
    public boolean checkOnesSegment(String s) {
        int j = 1;
        for(int i=s.length()-1;i>0;i--){
            if(s.charAt(i)=='1'){
                j = i;
                break;
            }
        }

        return !(s.substring(0,j).contains("0"));
    }
}