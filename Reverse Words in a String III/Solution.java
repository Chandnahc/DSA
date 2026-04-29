class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String res = "";
        for(int i=0;i<arr.length;i++){
            res += (new StringBuilder(arr[i]).reverse().toString());
            if(i!=arr.length-1){
                res += " ";
            }
        }
        return res;
    }
}