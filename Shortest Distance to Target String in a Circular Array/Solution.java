class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                if(i<startIndex){
                    int current = Math.min(startIndex-i,n-startIndex+i);
                    if(min>current){
                        min = current;
                    }
                }else{
                    int current = Math.min(i-startIndex,n-i+startIndex);
                    if(min>current){
                        min = current;
                    }
                }
            }
        }
        return min==Integer.MAX_VALUE ? -1:min;
    }
}