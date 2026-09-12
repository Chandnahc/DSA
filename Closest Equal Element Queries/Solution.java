class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        // List<Integer> l = new ArrayList<>();
        // for(int i=0;i<queries.length;i++){
        //     int target = nums[queries[i]];
        //     int idx = queries[i];
        //     int min = Integer.MAX_VALUE;
        //     int n = nums.length;
        //     for(int j=0;j<n;j++){
        //         if(j==idx){
        //             continue;
        //         }
        //         if(nums[j]==target){
        //             int temp = j<idx ? Math.min(idx-j,n-idx+j) : Math.min(j-idx,n-j+idx);
        //             if(min>temp){
        //                 min = temp;
        //             }
        //         }
        //     }
        //     l.add(min==Integer.MAX_VALUE?-1:min);
        // }
        // return l;

        int max = nums[0];
        for(int i:nums){
            if(i>max) max = i;
        }
        int n = nums.length;
        int[] lastIdx = new int[max+1];
        int[] firstIdx = new int[max+1];
        int[] minDis = new int[n];
        Arrays.fill(minDis,n+2);
        Arrays.fill(lastIdx,-1);
        Arrays.fill(firstIdx,-1);
        for(int i=0;i<n;i++){
            if(firstIdx[nums[i]]==-1){
                firstIdx[nums[i]] = i;
                lastIdx[nums[i]] = i;
                continue;
            }else{
                int lastIndex = lastIdx[nums[i]];
                int min = Math.min(i-lastIdx[nums[i]],n-i+lastIdx[nums[i]]);
                if(min < minDis[lastIdx[nums[i]]]) minDis[lastIdx[nums[i]]] = min;
                minDis[i] = min;
                lastIdx[nums[i]] = i;
            }
        }
        for (int x = 0; x <= max; x++) {

            if (firstIdx[x] == -1) continue;

            int first = firstIdx[x];
            int last = lastIdx[x];

            if (first == last) continue;

            int distance = n - last + first;

            minDis[first] = Math.min(minDis[first], distance);
            minDis[last] = Math.min(minDis[last], distance);
        }
        List<Integer> res = new ArrayList<>();
        for(int i:queries){
            if(minDis[i]==n+2){
                res.add(-1);
            }else{
                res.add(minDis[i]);
            }
        }
        return res;
        
    }
}