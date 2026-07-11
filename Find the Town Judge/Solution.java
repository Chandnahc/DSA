class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] arr = new int[n+1];
        int[] arr1 = new int[n+1];
        for(int i=0;i<trust.length;i++){
            arr[trust[i][0]] = -1;
            arr1[trust[i][1]]++;
        }
        for(int i=1;i<n+1;i++){
            if(arr[i]==0 && arr1[i]==n-1) return i;
        }
        return -1;
    }
}