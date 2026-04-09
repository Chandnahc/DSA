class Solution {
    public String addStrings(String num1, String num2) {
        String s = "";
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry = 0;
        while(i!=-1 && j!=-1){
            int temp = num1.charAt(i)-'0' + num2.charAt(j)-'0' + carry;
            if(temp>9){
                s = "" + temp%10 + s;
                carry = 1;
            }else{
                s = "" + temp + s;
                carry = 0;
            }
            i--;
            j--;
        }
        if(i==-1){
            while(j!=-1){
                int temp = num2.charAt(j)-'0' + carry;
                if(temp>9){
                    s = "" + temp%10 + s;
                    carry = 1;
                }else{
                    s = "" + temp + s;
                    carry = 0;
                }
                j--;
            }
        }
        if(j==-1){
            while(i!=-1){
                int temp = num1.charAt(i)-'0' + carry;
                if(temp>9){
                    s = "" + temp%10 + s;
                    carry = 1;
                }else{
                    s = "" + temp + s;
                    carry = 0;
                }
                i--;
            }
        }
        if(carry == 1){
            s = "1"+s;
        }
        return s;
    }
}