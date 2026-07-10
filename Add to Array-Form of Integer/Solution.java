class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i=num.length-1;
        int carry = 0;
        List<Integer> l = new ArrayList<>();
        for(;i>=0;i--){
            int temp = carry + num[i] + k%10;
            if(temp>9){
                carry = 1;
                temp = temp%10;
            }else{
                carry = 0;
            }
            // num[i] = temp;
            l.add(temp);
            k = k/10;
        }
        if(k!=0){
            while(k!=0){
                int temp = carry + k%10;
                if(temp>9){
                    carry = 1;
                    temp = temp%10;
                }else{
                    carry = 0;
                }
                l.add(temp);
                k = k/10;
            }
            if(carry == 1) l.add(1);
        }else{
            if(carry == 1) l.add(1);
        }
        return IntStream.range(0,l.size()).mapToObj(j -> l.get(l.size()-1-j)).collect(Collectors.toList());
    }
}