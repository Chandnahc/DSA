class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > 9*num) return "";
        StringBuilder sb = new StringBuilder("");
        for(int i=num;i>=1;i--){
            int min = Math.min(sum,9);
            sb.append(min);
            sum -= min;
        }
        return sb.toString();
    }
}