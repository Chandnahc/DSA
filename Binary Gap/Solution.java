class Solution {
    public int binaryGap(int n) {
        if(n==3){
            return 1;
        }
        int maxDis = 0;
        String s = Integer.toBinaryString(n);
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)=='1'){
                int temp = s.indexOf('1',i+1);
                // System.out.println(i+" "+temp+" "+s);
                if(temp!=-1){
                    if(maxDis<temp-i){
                        maxDis = temp-i;
                    }
                }
            }
        }
        return maxDis;
    }
}