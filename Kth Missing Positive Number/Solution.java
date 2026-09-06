class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(arr[0]!=1){
            if(k<arr[0]) return k;
            k -= arr[0]-1;

        }
        for(int i=1;i<arr.length;i++){
            int temp = arr[i]-arr[i-1];
            if(temp>1){
                if((temp-1)<k){
                    k -= temp-1;
                }else{
                    return arr[i-1]+k;
                }
            }
        }
        return arr[arr.length-1]+k;
    }
}