class Solution {
    public String makeGood(String s) {
        // System.out.println("--> "+s);
        if(s.length()<2) return s;
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length()-1;i++){
            if(Math.abs(s.charAt(i)-s.charAt(i+1))==32){
                i += 1;
                // continue;
            }else{
                sb.append(s.charAt(i));
            }
            if(i==s.length()-2){
                // if(sb.length()==0) 
                // char c = sb.charAt(sb.length()-1);
                if(sb.length()==0 || Math.abs(sb.charAt(sb.length()-1)-s.charAt(i+1))!=32){
                    sb.append(s.charAt(i+1));
                }else{
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            // System.out.println(sb);
        }
        return s.equals(sb.toString()) ? s : makeGood(sb.toString());
    }
}