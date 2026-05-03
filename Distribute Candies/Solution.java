class Solution {
    public int distributeCandies(int[] candyType) {
        Map<Integer,Integer> s = new HashMap<>();
        int n = candyType.length;
        for(int i=0;i<n;i++){
            s.putIfAbsent(candyType[i],1);
            if(s.size() >= n/2){
                return n/2;
            }
        }
        return n/2 < s.size() ? n/2 : s.size();
    }
}