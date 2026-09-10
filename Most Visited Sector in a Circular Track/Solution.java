class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int[] freq = new int[n+1];
        int max = 0;
        freq[rounds[0]]++;
        for(int i=1;i<rounds.length;i++){
            if(rounds[i]>rounds[i-1]){
                int j=rounds[i-1]+1;
                while(j<=rounds[i]){
                    freq[j]++;
                    if(freq[j]>max) max = freq[j];
                    j++;
                }
            }else{
                int j=rounds[i-1]+1;
                while(j<=n){
                    freq[j]++;
                    if(freq[j]>max) max = freq[j];
                    j++;
                }
                j=1;
                while(j<=rounds[i]){
                    freq[j]++;
                    if(freq[j]>max) max = freq[j];
                    j++;
                }
            }
        }
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<n+1;i++){
            if(freq[i]==max) l.add(i);
        }
        return l;
    }
}