class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=0;i<strs.length;i++){
            if(strs[i].startsWith(prefix)){
                continue;
            }else{
                String matchingPrefix="";
                int shortLength = Math.min(prefix.length(),strs[i].length());
                if(strs[i].length()==0 || prefix.charAt(0)!=strs[i].charAt(0)){
                    return "";
                }
                for(int j=0;j<shortLength;j++){
                    if(prefix.charAt(j)==strs[i].charAt(j)){
                        matchingPrefix = matchingPrefix + prefix.charAt(j);
                    }else{
                        break;
                    }
                }
                prefix = matchingPrefix;
            }
        }
        return prefix;
    }
}