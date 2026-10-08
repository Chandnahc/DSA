class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int j=0;
        for(int i=0;i<sandwiches.length;i++){
            int temp = j;
            while(j<n && students[j]!=sandwiches[i]) j++;
            if(j==n){
                j=0;
                while(j<temp && students[j]!=sandwiches[i]) j++;
                if(temp==j) return n-i;
            }
            students[j]=-1;
            j++;
        }
        return 0;
    }
}