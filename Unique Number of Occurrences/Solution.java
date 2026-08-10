class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2002];
        for(int i:arr){
            freq[i+1000]++;
        }
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<2002;i++){
            if(freq[i]!=0){
                if(!s.contains(freq[i])){
                    s.add(freq[i]);
                }else{
                    return false;
                }
            }
        }
        return true;
        
    }
}