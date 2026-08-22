class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            int rowMin = Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                if(col[j]<matrix[i][j]) col[j]=matrix[i][j];
                if(rowMin > matrix[i][j]) rowMin = matrix[i][j];
            }
            row[i] = rowMin;
        }

        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(row[i]==col[j]) l.add(row[i]);
            }
        }
        return l;
    }
}