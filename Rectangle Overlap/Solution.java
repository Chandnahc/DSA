class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        int x1 = rec1[0];
        int y1 = rec1[1];
        int x2 = rec1[2];
        int y2 = rec1[3];

        int a1 = rec2[0];
        int b1 = rec2[1];
        int a2 = rec2[2];
        int b2 = rec2[3];
        if(
            (
                (Math.max(x1,x2)<=Math.min(a1,a2)) 
                || (Math.min(x1,x2)>=Math.max(a1,a2))
            ) 
            ||
            (
                (Math.max(y1,y2)<=Math.min(b1,b2)) 
                || (Math.min(y1,y2)>=Math.max(b1,b2))
            )
        ) return false;
        return true;
    }
}