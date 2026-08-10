class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(minDiff > arr[i]-arr[i-1]){
                minDiff = arr[i]-arr[i-1];
            }
        }
        List<List<Integer>> l = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(minDiff == arr[i]-arr[i-1]){
                l.add(List.of(arr[i-1],arr[i]));
            }
        }
        return l;
    }
}