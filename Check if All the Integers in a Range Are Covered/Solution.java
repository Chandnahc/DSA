class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int count = right - left + 1;
        boolean[] freq = new boolean[count];
        for(int[] i:ranges){
            if(i[0]>right || i[1]<left){
                continue;
            }else{
                for(int j = Math.max(left,i[0]);j<=Math.min(right,i[1]);j++){
                    if(!freq[j-left]){
                        count--;
                        if(count==0) return true;
                        freq[j-left] = true;
                    }
                }
            }
        }
        return false;
    }
}