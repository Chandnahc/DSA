class Solution {
    public String reformat(String s) {
        List<Character> ch = new ArrayList<>();
        List<Integer> dig = new ArrayList<>();
        for(char c:s.toCharArray()){
            if(c>='a' && c<='z'){
                ch.add(c);
            }else{
                dig.add(c-'0');
            }
        }
        int diff = Math.abs(ch.size()-dig.size());
        if(diff==0 || diff==1){
            StringBuilder sb = new StringBuilder("");
            int i = ch.size()-1;
            int j = dig.size()-1;
            while(i>=0 && j>=0){
                sb.append((char)('0'+dig.get(j)));
                sb.append(ch.get(i));
                j--;
                i--;
            }
            if(ch.size()>dig.size()){
                sb.insert(0,ch.get(i));
            }else if(ch.size()<(dig.size())){
                sb.append((char)('0'+dig.get(j)));
            }
            return sb.toString();
        }else{
            return "";
        }
    }
}