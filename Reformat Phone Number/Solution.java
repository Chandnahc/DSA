class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb= new StringBuilder("");
        for(char c:number.toCharArray()){
            if(c>='0' && c<='9'){
                sb.append(c);
            }
        }
        StringBuilder sb1 = new StringBuilder("");
        for(int i=0;i<sb.length();){
            if(i+3 < sb.length()-1){
                sb1.append(sb.charAt(i));
                sb1.append(sb.charAt(i+1));
                sb1.append(sb.charAt(i+2));
                sb1.append('-');
                i+=3;
            }else{
                if(sb.length() - i <=3){
                    while(i<sb.length()){
                        sb1.append(sb.charAt(i++));
                    }
                }else{
                    sb1.append(sb.charAt(i));
                    sb1.append(sb.charAt(i+1));
                    sb1.append('-');
                    sb1.append(sb.charAt(i+2));
                    sb1.append(sb.charAt(i+3));
                }
                break;
            }
        }
        return sb1.toString();
    }
}