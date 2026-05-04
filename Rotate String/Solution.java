class Solution {
    public boolean rotateString(String s, String goal) {
        int l = s.length();
        String temp = s;
        for(int i=0;i<l;i++){
            if(temp.equals(goal)){
                return true;
            }else{
                temp = temp.substring(1) + temp.charAt(0);
            }
        }
        return false;
    }
}