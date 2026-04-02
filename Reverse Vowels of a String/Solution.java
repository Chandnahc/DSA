class Solution {
    public String reverseVowels(String s) {
        int len = s.length();
        char[] res = s.toCharArray();
        int low = 0;
        int high = len-1;
        String pattern = "AEIOUaeiou";
        while(low<high){
            Boolean l = pattern.indexOf(res[low])!=-1;
            Boolean h = pattern.indexOf(res[high])!=-1;
            if(l && h){
                char temp = res[low];
                res[low] = res[high];
                res[high] = temp;
                low++;
                high--;
                continue;
            }else if(l){
                high--;
                continue;
            }else if(h){
                low++;
                continue;
            }else{
                low++;
                high--;
            }
        }
        return new String(res);
    }
}