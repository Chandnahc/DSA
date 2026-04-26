class Solution {
    public boolean detectCapitalUse(String word) {
        String upper = word.toUpperCase();
        System.out.println(upper + " "+word);
        if(upper.equals(word)) return true;
        String lower = word.toLowerCase();
        if(lower.equals(word)) return true;
        String capital = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        if(capital.equals(word)) return true;

        return false;
    }
}