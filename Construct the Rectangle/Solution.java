class Solution {
    public int[] constructRectangle(int area) {
        int i = 1;
        int j = area;
        int[] res = new int[2];
        if(area==1){
            res[0] = 1;
            res[1] = 1;
            return res;
        }
        res[1] = Integer.MAX_VALUE;
        while(i<=area/2){
            if(area%i==0){
                j = area/i;
                if(Math.abs(j-i) < Math.abs(res[0]-res[1])){
                    res[0] = i;
                    res[1] = j;
                }
            }
            i++;
        }
        if(res[0]<res[1]){
            int temp = res[0];
            res[0] = res[1];
            res[1] = temp;
        }
        return res;
    }
}