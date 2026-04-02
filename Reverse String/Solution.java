class Solution {
    public void reverseString(char[] s) {
        int l = s.length;
        int low = 0;
        int high = l-1;
        while(low<high){
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
    }
}