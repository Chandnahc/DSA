class Solution {
    public double angleClock(int hour, int minutes) {
        double t = (hour%12) * 30 + minutes*0.5;
        double m = minutes * 6;
        double res = Math.abs(t-m);
        return Math.min(res,360-res);
    }
}