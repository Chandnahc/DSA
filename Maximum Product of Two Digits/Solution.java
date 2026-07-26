class Solution {
    public int maxProduct(int n) {
        int max = -1;
        int max1 = -1;
        while(n>0){
            int temp = n%10;
            n = n/10;
            if(temp>max){
                max1 = max;
                max = temp;
            }else if(temp>max1){
                max1 = temp;
            }
        }
        return max * max1;
    }
}