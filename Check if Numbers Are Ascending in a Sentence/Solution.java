class Solution {
    public boolean areNumbersAscending(String s) {
        String[] sarr = s.split(" ");
        int prev = 0;
        for(String i:sarr){
            if(i.charAt(0)>='0' && i.charAt(0)<='9'){
                int temp = Integer.valueOf(i);
                if(temp <= prev) return false;
                prev = temp;
            }
        }
        return true;
    }
}