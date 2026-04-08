class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[52];
        int l = s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i)-'A'>26){
                freq[s.charAt(i)-'a']++;
            }else{
                freq[s.charAt(i)-'A'+26]++;
            }
        }
        int sum = 0;
        boolean oddPresent = false;
        for(int i=0;i<52;i++){
            if(freq[i]%2!=0){
                oddPresent = true;
            }
            sum += 2 * ( freq[i]/2);
        }
        return oddPresent ? sum+1:sum;
    }
}