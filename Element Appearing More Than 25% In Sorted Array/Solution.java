class Solution {
    public int findSpecialInteger(int[] arr) {
        int quarter = arr.length / 4;
        int[] freq = new int[100001];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
            if(freq[arr[i]] > quarter) return arr[i];
        }
        return -1;
    }
}