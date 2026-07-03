class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int t = 0;
        for(;i<name.length()-1;i++){
            if(t==typed.length()) return false;
            if(name.charAt(i)==typed.charAt(t)){
                if(name.charAt(i)==name.charAt(i+1)){
                    t++;
                }else{
                    while(name.charAt(i)==typed.charAt(t)){
                        t++;
                        if(t==typed.length()) return false;
                    }
                }
            }else{
                return false;
            }
        }
        if(name.charAt(i)==typed.charAt(t)){
            while(t<typed.length() && (name.charAt(i)==typed.charAt(t))){
                t++;
            }
            return t == typed.length();
        }else{
            return false;
        }
    }
}