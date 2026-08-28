class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i:candies){
            if(i>max) max = i;
        }
        List<Boolean> l = new ArrayList<>();
        for(int i:candies){
            l.add((i+extraCandies)>=max);
        }
        return l;
    }
}