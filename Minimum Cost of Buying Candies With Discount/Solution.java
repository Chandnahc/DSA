class Solution {
    public int minimumCost(int[] cost) {
        int minCost = 0;
        Arrays.sort(cost);
        if(cost.length<1) return cost[0]; 
        for(int i = cost.length-1;i>=0;i--){
            if((cost.length-i)%3==0) continue;
            minCost += cost[i];
        }
        return minCost;
    }
}