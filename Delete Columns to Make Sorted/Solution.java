class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int n = strs.length;
        int c = strs[0].length();
        for(int i=0;i<c;i++){
            for(int j=0;j<n-1;j++){
                if(strs[j].charAt(i)>strs[j+1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}