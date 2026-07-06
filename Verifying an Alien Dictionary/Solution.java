class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] orderArr = new int[26];
        for(int i=0;i<order.length();i++){
            orderArr[order.charAt(i)-'a'] = i;
        }
        for(int i=0;i<words.length-1;i++){
            int currSize = words[i].length();
            int nextSize = words[i+1].length();
            if(currSize>nextSize){
                if(words[i].indexOf(words[i+1])==0) return false;
            }
            int temp = Math.min(currSize,nextSize);
            int j = 0;
            while(j<temp){
                if(orderArr[words[i].charAt(j) - 'a']>orderArr[words[i+1].charAt(j)-'a']){
                    return false;
                }else if(orderArr[words[i].charAt(j) - 'a']<orderArr[words[i+1].charAt(j)-'a']){
                    break;
                }
                j++;
            }
        }
        return true;
    }
}