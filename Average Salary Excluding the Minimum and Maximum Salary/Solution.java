class Solution {
    public double average(int[] salary) {
        double res = 0.00000;
        int min = salary[0];
        int max = salary[0];
        int sum = 0;
        for(int i:salary){
            sum += i;
            if(i<min) min = i;
            if(i>max) max = i;
        }
        res = (double) (sum-min-max) / (salary.length-2);
        return res;
    }
}