class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int temp = i;
            boolean flag = true;
            while(temp!=0){
                int rem = temp%10;
                if(rem == 0){
                    flag = false;
                    break;
                }else if(i%rem!=0){
                    flag = false;
                    break;
                }else{
                    temp = temp/10;
                }
            }
            if(flag) l.add(i);
        }
        return l;
    }
}