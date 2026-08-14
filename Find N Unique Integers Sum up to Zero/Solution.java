class Solution {
    public int[] sumZero(int n) {
        int half = n/2;
        half = -half;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            if(n%2==0 && half==0){
                half++;
            }
            arr[i] = half++;
        }
        return arr;
    }
}