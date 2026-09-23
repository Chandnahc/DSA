class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for(String i:logs){
            if(i.equals("../")) count = (count==0) ? 0 : count-1;
            else if(i.equals("./")) {}
            else count++;
        }
        return count>=0 ? count : 0;
    }
}