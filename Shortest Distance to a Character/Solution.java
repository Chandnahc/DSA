class Solution {
    public int[] shortestToChar(String s, char c) {
        int low = 0;
        int idx = 0;
        int[] res = new int[s.length()];
        while(low<s.length()){
            if(s.charAt(idx)!=c){
                idx++;
            }else{
                if(s.charAt(low)==c){
                    idx = low;
                }else{
                    if(low>idx){
                        for(int i=low;i<2*low-idx+1 && i<s.length();i++){
                            if(s.charAt(i)==c){
                                idx = i;
                                break;
                            }
                        }
                    }
                }
                res[low] = Math.abs(idx-low);
                low++;
            }
        }
        return res;
    }
}