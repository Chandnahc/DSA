class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int n = highLimit - lowLimit + 1;
        int[] freq = new int[n];
        int max = 0;
        for(int j=lowLimit;j<=highLimit;j++){
            int temp = j;
            while(temp!=0){
                freq[j-lowLimit] += temp%10;
                temp /= 10;
            }
            max = Math.max(max,freq[j-lowLimit]);
        }
        int[] cnt = new int[max+1];
        max = 0;
        for(int i=0;i<n;i++){
            cnt[freq[i]]++;
            max = Math.max(max,cnt[freq[i]]);
        }
        return max;
    }
}