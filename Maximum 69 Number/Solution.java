class Solution {
    public int maximum69Number (int num) {

        int res = 0;
        while(num!=0){
            res = res*10 + num%10;
            num /= 10;
        }
        num = res;
        res = 0;
        boolean f = true;
        while(num!=0){
            if(num%10==6){
                if(f){
                    res = res*10 + 9;
                    num /= 10;
                    f = false;
                    continue;
                }
            }
            res = res*10 + num%10;
            num /= 10;
        }
        return res;
    }
}