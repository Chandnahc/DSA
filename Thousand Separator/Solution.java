class Solution {
    public String thousandSeparator(int n) {
        int count = 0;
        if(n==0) return ""+n;
        String s="";
        while(n!=0){
            if(count==3){
                count=0;
                s +=".";
            }
            s += ""+(n%10);
            count++;
            n /= 10;
        }
        return (new StringBuilder(s)).reverse().toString();
    }
}