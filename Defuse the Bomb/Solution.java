class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k==0){
            Arrays.fill(code,0);
            return code;
        }
        int n = code.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = code[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = code[i]+prefixSum[i-1];
        }
        if(k>0){
            for(int i=0;i<n;i++){
                if(i+k > n-1){
                    code[i] = prefixSum[n-1] - prefixSum[i] + prefixSum[k-n+i];
                }else{
                    code[i] = prefixSum[i+k] - prefixSum[i];
                }
            }
        }else{
            for(int i=0;i<n;i++){
                if(i+k < 0){
                    code[i] = i==0 ? prefixSum[n-1] - prefixSum[n+k-1] : prefixSum[i-1] + prefixSum[n-1] - prefixSum[n+k+i-1];
                }else{
                    code[i] = i+k==0 ? prefixSum[i-1] : prefixSum[i-1] - prefixSum[i+k-1];
                }
            }
        }
        return code;
    }
}