class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // if(str1.length()>str2.length()){
        //     if(str1.indexOf(str2)!=-1){
        //         int idx = str1.indexOf(str2);
        //         str1 = str1.substring(0,idx) + str1.substring(idx+str2.length());
        //         return gcdOfStrings(str1,str2);
        //     }else{
        //         return "";
        //     }
        // }else{
        //     if(str2.indexOf(str1)!=-1){
        //         int idx = str1.indexOf(str2);
        //         str1 = str1.substring(0,idx) + str1.substring(idx+str2.length());
        //         return gcdOfStrings(str1,str2);
        //     }else{
        //         return "";
        //     }
        // }
        if((str1+str2).equals(str2+str1)){
            return str1.substring(0,gcd(str1.length(),str2.length()));
        }else{
            return "";
        }
    }

    private int gcd(int a,int b){
        if(a==0) return b;
        if(a>b) return gcd(a%b,b);
        else return gcd(b%a,a);
    }
}