class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
        int count = 0;
        for(List<String> i:items){
            if(ruleValue.equals(i.get(idx))) count++;
        }
        return count;
    }
}