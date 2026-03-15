class Solution {
    public int minOperations(String s) {
        int oneStartOp = 0;
        int zeroStartOp = 0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='1'){
                    zeroStartOp++;
                }else{
                    oneStartOp++;
                }
            }else{
                if(s.charAt(i)=='1'){
                    oneStartOp++;
                }else{
                    zeroStartOp++;
                }
            }
        }
        return Math.min(zeroStartOp,oneStartOp);
    }
}