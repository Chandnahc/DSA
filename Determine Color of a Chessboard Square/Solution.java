class Solution {
    public boolean squareIsWhite(String coordinates) {
        int c1 = (int)(coordinates.charAt(1) - '0');
        int c0 = (int)(coordinates.charAt(0) - 'a');
        return c1%2==0 ? c0%2==0 : c0%2==1;
    }
}