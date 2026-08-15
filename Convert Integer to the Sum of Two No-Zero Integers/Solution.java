class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res = new int[2];
        int i=1;
        while(true){
            int temp = i;
            boolean f = false;
            while(temp!=0){
                if(temp%10==0){
                    f = true;
                    break;
                }else{
                    temp = temp/10;
                }
            }
            if(f) {
                i++;
                continue;
            }
            temp = n-i;
            while(temp!=0){
                if(temp%10==0){
                    f = true;
                    break;
                }else{
                    temp = temp/10;
                }
            }
            if(f){
                i++;
                continue;
            }else{
                res[0] = i;
                res[1] = n-i;
                return res;
            }
        }
    }
}