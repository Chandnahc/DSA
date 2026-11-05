class Solution {
    public boolean checkZeroOnes(String s) {
        char[] ch = s.toCharArray();
        int longestOnes = 0;
        int longestZeros = 0;
        int oneL = -1;
        int zeroL = -1;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                if(oneL == -1){
                    oneL = i;
                    // continue;
                }
                if(zeroL != -1){
                    longestZeros = Math.max(longestZeros,i-zeroL);
                    zeroL = -1;
                }
            }else{
                if(zeroL == -1){
                    zeroL = i;
                    // continue;
                }
                if(oneL != -1){
                    longestOnes = Math.max(longestOnes,i-oneL);
                    oneL = -1;
                }
            }
        }
        // System.out.println(longestOnes+" "+longestZeros);
        if(zeroL!=-1){
            longestZeros = Math.max(longestZeros,ch.length-zeroL);
        }
        if(oneL!=-1){
            longestOnes = Math.max(longestOnes,ch.length-oneL);
        }
        // System.out.println(longestOnes+" "+longestZeros);
        return longestOnes > longestZeros;
    }
}