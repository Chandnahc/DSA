class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(n==1) return true;
        int[] visited = new int[n];
        Map<Integer, List<Integer>> m = new HashMap<>();
        for(int i=0;i<edges.length;i++){
            int left = edges[i][0];
            int right = edges[i][1];
            if((left==source && right==destination) || (left==destination && right==source)){
                return true;
            }
            m.computeIfAbsent(left, k -> new ArrayList<>()).add(right);
            m.computeIfAbsent(right, k -> new ArrayList<>()).add(left);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = 1;
        while(q.peek()!=null){
            for(int i:m.get(q.peek())){
                if(i==destination) return true;
                if(visited[i]!=1) q.add(i);
                visited[i]=1;
            }
            q.poll();
        }
        return false;
    }
}