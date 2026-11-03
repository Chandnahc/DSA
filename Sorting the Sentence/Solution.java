class Solution {
    public String sortSentence(String s) {
        String[] sarr = s.split(" ");
        String[] arr = new String[10];
        for(String i:sarr){
            int idx = (int)(i.charAt(i.length()-1) - '0');
            arr[idx] = i;
        }
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<arr.length;i++){
            if(arr[i]==null) continue;
            sb.append(arr[i].substring(0,arr[i].length()-1));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}