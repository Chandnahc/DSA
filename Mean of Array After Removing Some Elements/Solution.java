class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int offset = n/20;
        int sum = 0;
        for(int i=offset;i<n-offset;i++){
            sum += arr[i];
        }
        return (double)sum/(n-2*offset);
    }
}