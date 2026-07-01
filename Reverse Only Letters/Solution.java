class Solution {
    public String reverseOnlyLetters(String s) {
        char[] c = s.toCharArray();
        // for(char i:c){
        //     if((i>='a' && i<='z') && (i<))
        // }

        int low = 0;
        int high = c.length-1;
        while(low<high){
            if(check(c[low]) && check(c[high])){
                char ch = c[low];
                c[low] = c[high];
                c[high] = ch;
                low++;
                high--;
            }else if(check(c[low])){
                high--;
            }else{
                low++;
            }
        }
        return new String(c);
    }

    private boolean check(char i){
        return (i>='a' && i<='z') || (i>='A' && i<='Z');
    }

}