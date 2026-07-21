class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        Queue<Integer> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        k = k%(m*n);
        int tempi = 0;
        int j = 0;
        for(int i=0;i<m;i++){
            j = 0;
            for(;j<n;j++){
                if(k==0){
                    tempi = i;
                    i = m;
                    break;
                }
                k--;
                q.add(grid[i][j]);
            }
        }
        System.out.println(tempi+" "+j+" "+q);
        for(int i = tempi;i<m;i++){
            for(int tempj = j;tempj<n;tempj++){
                q.add(grid[i][tempj]);
                grid[i][tempj] = q.poll();
            }
            j=0;
        }
        System.out.println(q);
        for(int i=0;i<m;i++){
            for(int tempj = 0;tempj<n;tempj++){
                if(q.isEmpty()){
                    i=m;
                    break;
                }
                grid[i][tempj]=q.poll();
            }
        }
        return Arrays.stream(grid)
    .map(row -> Arrays.stream(row)
        .boxed()
        .collect(Collectors.toList()))
    .collect(Collectors.toList());
        
    }
}