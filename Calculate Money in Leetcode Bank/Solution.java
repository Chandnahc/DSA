class Solution {
    public int totalMoney(int n) {
        int temp = n/7;
        int rem = n%7;
        return 28 *temp + 7 * (temp * (temp-1) / 2) + (rem * (rem+1) / 2) + rem*temp; 
    }
}