class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder("");
        if(n%2==1){
            while(n!=0){
                sb.append('a');
                n--;
            }
        }else{
            while(n!=1){
                sb.append('a');
                n--;
            }
            sb.append('b');
        }
        return sb.toString();
    }
}