class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0) return arr;
        int[] tempArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            tempArr[i] = arr[i];
        }
        Arrays.sort(tempArr);
        int rank=1;
        Map<Integer,Integer> m = new HashMap<>();
        int curr = tempArr[0];
        for(int i=0;i<arr.length;i++){
            if(tempArr[i]==curr){
                m.put(tempArr[i],rank);
            }else{
                m.put(tempArr[i],++rank);
                curr = tempArr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = m.get(arr[i]);
        }
        return arr;
    }
}