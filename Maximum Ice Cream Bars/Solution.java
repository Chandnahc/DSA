class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i = 0;
        for(;i<costs.length;i++){
            if(coins-costs[i]<0){
                return i;
            }else{
                coins -= costs[i];
            }
        }
        return i;
    }
}