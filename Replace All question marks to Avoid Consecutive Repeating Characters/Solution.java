class Solution {
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i<s.length();i++){
            if(i==0 && s.charAt(i)=='?'){
                if(s.length()>i+1){
                    if(s.charAt(i+1)=='a'){
                        sb.append('b');
                    }else{
                        sb.append('a');
                    }
                }else{
                    sb.append('a');
                }
                continue;
            }
            if(i==s.length()-1 && s.charAt(i)=='?'){
                if(sb.charAt(i-1)=='a'){
                    sb.append('b');
                }else{
                    sb.append('a');
                }
                continue;
            }
            if(s.charAt(i)=='?'){
                if(sb.charAt(i-1)=='a' || s.charAt(i+1)=='a'){
                    if(sb.charAt(i-1)=='b' || s.charAt(i+1)=='b'){
                        sb.append('c');
                    }else{
                        sb.append('b');
                    }
                }else{
                    sb.append('a');
                }
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}