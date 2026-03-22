class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }else{
            if(n<10 && n!= 7){
                return false;
            }
            int t = n;
            int sum = 0;
            while(t!=0){
                int r = t%10;
                sum += r*r;
                t = t/10;
            }
            return isHappy(sum);
        }
        
    }
}