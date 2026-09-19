class Solution {
    public String toHex(int num) {
        if(num==-2147483648) return "80000000";
        char[] arr = new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder sb = new StringBuilder("");
        if(num<0){
            num = 0-num;
            System.out.println(num);
            while(num!=0){
                sb.append(arr[num%2]);
                num /= 2;   
            }
            for(int i=sb.length();i<32;i++){
                sb.append('0');
            }
            System.out.println(sb);
            StringBuilder sb1 = new StringBuilder("");
            for(int i=0;i<32;i++){
                if(sb.charAt(i)=='1') sb.setCharAt(i,'0');
                else sb.setCharAt(i,'1');
            }
            int i=0;
            while(sb.charAt(i)!='0'){
                sb.setCharAt(i,'0');
                i++;
            }
            sb.setCharAt(i,'1');
            i=0;
            for(;i<32;i+=4){
                int idx = 1*(sb.charAt(i)-'0') + 2*(sb.charAt(i+1)-'0') + 4*(sb.charAt(i+2)-'0') + 8*(sb.charAt(i+3)-'0');
                sb1.append(arr[idx]);
            }
            return sb1.reverse().toString();

        }
        if(num==0) return "0";
        while(num!=0){
            sb.append(arr[num%16]);
            num /= 16;
        }
        return sb.reverse().toString();
    }
}