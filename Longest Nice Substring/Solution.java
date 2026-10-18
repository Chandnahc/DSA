class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        String res = "";
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                String temp = s.substring(i,j+1);
                boolean flag = true;
                for(char c:temp.toCharArray()){
                    if(c>='A' && c<='Z'){
                        char t = (char) (c+32);
                        if(temp.indexOf(t)==-1){
                            flag = false;
                            break;
                        }
                    }else{
                        char t = (char) (c-32);
                        if(temp.indexOf(t)==-1){
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag && temp.length()>res.length()) res = temp;
            }
        }
        return res;
    }
}