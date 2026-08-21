class Solution {
    public String entityParser(String text) {
        Map<String, String> map = Map.of("&quot;","\"","&apos;","'","&amp;","&","&gt;",">","&lt;","<","&frasl;","/");

        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='&'){
                int j=i-1;
                StringBuilder s = new StringBuilder("");
                do{
                    j++;
                    if(j==text.length()) break;
                    s.append(text.charAt(j));
                }while(j<(i+7) && text.charAt(j)!=';');
                if(map.containsKey(s.toString())){
                    sb.append(map.get(s.toString()));
                    i = j;
                }else{
                    sb.append(text.charAt(i));
                }
            }else{
                sb.append(text.charAt(i));
            }
        }

        return sb.toString();
    }
}